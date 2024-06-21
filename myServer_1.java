package project;

import com.vmm.JHTTPServer;
import java.io.IOException;
import java.util.Properties;
import java.sql.*;
import java.util.StringTokenizer;

public class myServer_1 extends JHTTPServer 
{
    
    public myServer_1(int port) throws IOException
    {
        super(port);  // super is parent class constructor
    }

    @Override
    public Response serve(String uri, String method, Properties header, Properties parms, Properties files) 
    {
        Response res=null;
//        if(uri.contains("/"))
//        {
//            String ans=Math.random()+"";  //Double to string
//            
//             res=new Response(HTTP_OK,"text/plain",ans);
//            return res;
//        }
//        else if(uri.contains("/one"))
//        {
//            String ans=Math.random()+"";  //Double to string
//            
//             res=new Response(HTTP_OK,"text/plain",ans);
//            return res;            
//        }
         if(uri.contains("/userlogin"))
        {
            String username = parms.getProperty("username");
            String password= parms.getProperty("password");
            try
            {
                ResultSet rs=DBLoader.executeSQL("select * from users where useremail='"+username +"' and password ='"+password+"'");
                if(rs.next())
                {
                    res=new Response(HTTP_OK,"test/plain","success");
                   // return res;
                }
                else
                {
                    res=new Response(HTTP_OK,"test/plain","fail");
                    //return res;
                }
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
         else if(uri.contains("/usersignup"))
         {
             String email=parms.getProperty("email");
             String password=parms.getProperty("pass");
             String mobile=parms.getProperty("mobile");
             String address=parms.getProperty("address");
             
             String name=saveFileOnServerWithRandomName(files, parms, "f1","src/uploads");
             
             try
             {
                ResultSet rs=DBLoader.executeSQL("select * from users ");
               
                
             
                
                    
                    ResultSet rs1 =DBLoader.executeSQL("select * from users where mobile= '"+mobile+"'");
                    if(rs1.next())
                    {
                        res=new Response(HTTP_OK,"text/plain","mobile");
                    }
                    else
                    {
                         
                    rs1.moveToInsertRow();
                    rs1.updateString("useremail",email);
                    rs1.updateString("password",password);
                    rs1.updateString("mobile",mobile);
                    rs1.updateString("address",address);
                    rs1.updateString("photo","src/uploads/"+name);
                    rs1.insertRow();
                    GLOBAL.myotp="";
                    res=new Response(HTTP_OK,"text/plain","success");
                    
                    }

                
             }
             catch (Exception e)
             {
                 e.printStackTrace();
             }
         }
         else if(uri.equals("/verifyEmail"))
         {
             String email=parms.getProperty("email");
             
    
             try
             {
                 ResultSet rs=DBLoader.executeSQL("select * from users where useremail= '"+email+"'");
                 if(rs.next())
                 {
                     res=new Response(HTTP_OK,"text/plain","exists");
                 }
                 else
                 {
                      String otp =  (int) (1000+(9999-1000)*Math.random())+"";
                      System.out.println("-----> "+otp);
            sendemail obj = new sendemail(email,"hello","Your Otp is: "+otp);
                    // set OTP to global variable
                    
                     GLOBAL.myotp=otp;
                     res=new Response(HTTP_OK,"text/plain",otp);
                 }
             } 
             catch(Exception ex)
             {
                 ex.printStackTrace();
               
                 
             }
         }
         else if(uri.equals("/fetchcat"))
         {
             String ans="";
             try 
             {
                ResultSet rs=DBLoader.executeSQL("select * from category");
                while(rs.next())
                {
                    String name=rs.getString("name");
                    String photo=rs.getString("photo");
                    String row=name+"$"+photo;
                    ans=ans+row+";;";
                     res=new Response(HTTP_OK,"text/plain",ans);
                    
                }
             } 
             catch (Exception e) 
             {
                 e.printStackTrace();
             }
         }
         else if(uri.equals("/AdminLogin"))
         {
             String name=parms.getProperty("name");
             String pass=parms.getProperty("pass");
             try
             {
                ResultSet rs=DBLoader.executeSQL("select * from admin where username='"+name+"'and password='"+pass+"'");
                if(rs.next())
                {
                      res=new Response(HTTP_OK,"text/plain","success");
                }
                else
                {
                      res=new Response(HTTP_OK,"text/plain","fail");
                }
             } 
             catch (Exception e)
             {
                 e.printStackTrace();
             }
             
         }
         else if(uri.equals("/addcat"))
         {
             String category= parms.getProperty("category");
             String name=saveFileOnServerWithRandomName(files, parms,"f1","src/uploads/");
             try 
             {
                 ResultSet rs=DBLoader.executeSQL("select * from category where name= '"+category+"'");
                 if(rs.next())
                 {
                      res=new Response(HTTP_OK,"text/plain","exists");
                 }
                 else
                 {
                     rs.moveToInsertRow();
                     rs.updateString("name",category);
                     rs.updateString("photo","src/uploads/"+name);
                     rs.insertRow();
                     res=new Response(HTTP_OK,"text/plain","success");
                     
                 }
             }
             catch (Exception e)
             {
                 
             }
             
         }
         else if(uri.equals("/fetchcategories"))
         {
             try 
             {
               ResultSet rs=DBLoader.executeSQL("select name from category");
               String ans="";
               while(rs.next())
               {
                   String name=rs.getString("name");
                   String row =name;
                   ans=ans+row+";;";
                   
               }
               res=new Response(HTTP_OK,"text/plain",ans);
               
             } catch (Exception e) {
             }
         }
         else if(uri.equals("/addmovie"))
         {
             String category=parms.getProperty("category");
             String movie=parms.getProperty("movie");
             String director =parms.getProperty("director");
             String cast=parms.getProperty("cast");
             String id=parms.getProperty("id");
             String name=saveFileOnServerWithRandomName(files, parms, "f2", "src/uploads/");
             String movie_name=saveFileOnServerWithRandomName(files, parms, "movie_link", "src/uploads/movies");
             try 
             {
               ResultSet rs=DBLoader.executeSQL("select * from movies ");
               rs.moveToInsertRow();
               rs.updateString("movie_name",movie);
               rs.updateString("director",director);
               rs.updateString("cast",cast);
              
               rs.updateString("movie_link","src/uploads/movies/"+movie_name);
               rs.updateString("trailer",id);
               rs.updateString("photo","src/uploads/"+name);
               rs.updateString("category",category);
               rs.insertRow();
               res=new Response(HTTP_OK,"text/plain", "success");
               
               
               
                       
             } 
             catch (Exception e)
             {
                res=new Response(HTTP_OK,"text/plain", e.toString());
             }
             
         }
         else if(uri.equals("/fetchmovies"))
         {
             String ans="";
             String category=parms.getProperty("category");
             try
             {
              ResultSet rs=DBLoader.executeSQL("select * from movies where category='"+category+"'");
              
              while(rs.next())
              {
                 int id=rs.getInt("id");
                 String name=rs.getString("movie_name");
                 String photo=rs.getString("photo");
                 String row=id+"$"+name+"$"+photo;
                 ans=ans+row+";;";
                 
                 res=new Response(HTTP_OK,"text/plain", ans);
              }
              
             }
             catch (Exception e)
             {
                 e.printStackTrace();
                 res=new Response(HTTP_OK,"text/plain", e.toString());
             }
         }
         else if(uri.equals("/moviedetails"))
         {
             int id=Integer.parseInt(parms.getProperty("id"));
             try 
             {
               ResultSet rs=DBLoader.executeSQL("select * from movies where id="+id);
               if(rs.next())
               {
                   String name=rs.getString("movie_name");
                   String director=rs.getString("director");
                   String cast=rs.getString("cast");
                   String youtube_id=rs.getString("trailer");
                   String photo=rs.getString("photo");
                   String movie_link=rs.getString("movie_link");
                   
                   String ans=name+"$"+director+"$"+cast+"$"+youtube_id+"$"+photo+"$"+movie_link;
                   
                   res=new Response(HTTP_OK,"text/plain", ans);
               }
             }
             catch (Exception e) 
             {
                 e.printStackTrace();
             }
         }
        return res;
    }
    
    
//    public static void main(String[] args) 
//    {
//        try
//        {
//           myServer_1 obj=new myServer_1(9000); 
//           Thread.sleep(10000000);
//        }
//        catch (Exception e) 
//        {
//            e.printStackTrace();
//        }
//    }
//    
}

