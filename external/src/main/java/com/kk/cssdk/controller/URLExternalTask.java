package com.kk.cssdk.controller;

/*
import com.interwoven.cssdk.common.CSClient;
import com.interwoven.cssdk.common.CSException;
import com.interwoven.cssdk.factory.CSFactory;
import com.interwoven.cssdk.workflow.CSExternalTask;
import com.interwoven.cssdk.workflow.CSURLExternalTask;
*/
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;


@Controller
@RequestMapping(value="urlexternaltask")
public class URLExternalTask {


	/**IO
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final String TASK_VARIABLE_CLASSNAME = "ClassName";

  //  private static final Logger LOGGER = Logger.getLogger(URLExternalTask.class);


    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    @RequestMapping(value="")
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
        System.out.println("=================urlexternaltask Inside URLExternalTaskServlet processRequest=======================");
/*    	String iw_sessionstring = request.getParameter("iw_sessionstring");
    	String taskid = request.getParameter("taskid");
    	 System.out.println("iw_sessionstring : "+iw_sessionstring);
    	 System.out.println("taskid : "+taskid);
    //	if(StringUtils.isNotBlank(iw_sessionstring) &&
    //		StringUtils.isNotBlank(taskid) && StringUtils.isNumeric(taskid)) {
    	if(iw_sessionstring !=null && taskid!=null) {
            try {
                CSClient client = getCSClientFromSession(iw_sessionstring);

                CSExternalTask task = (CSExternalTask)client.getTask(Integer.parseInt(taskid));
                System.out.println("External Task Id - " + task.getName());

                String handlerClassName = task.getVariable(TASK_VARIABLE_CLASSNAME);
                String [] parts = handlerClassName.split("\\.");
                String className = parts[parts.length - 1];
                String firstChar = className.substring(0,1);

                StringBuilder sb  = new StringBuilder(className);
                sb.replace(0,1,firstChar.toLowerCase());
                
                Class<CSURLExternalTask> handlerClass = (Class<CSURLExternalTask>) Class.forName(handlerClassName);
//                CSURLExternalTask urlExternalTask = handlerClass.newInstance();
                System.out.println("request.getServletContext()- " + request.getServletContext());
                WebApplicationContext wac = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
                System.out.println("wac- " + wac);
                System.out.println("wac.getDisplayName- " + wac.getDisplayName());
                System.out.println("handlerClass- " + handlerClass);
                Map<String, CSURLExternalTask> beans = wac.getBeansOfType(handlerClass);
                
                System.out.println("beans- " + beans);
                CSURLExternalTask urlExternalTask = beans.get(sb.toString());
                System.out.println("urlExternalTask- " + urlExternalTask);
                System.out.println("Calling urlExternalTask execute method");
                urlExternalTask.execute(client, task, new Hashtable());

            } catch (CSException e) {
            	 System.out.println("CSException : "+e);
                Hashtable<String, String> additionalInfo = new Hashtable<String, String>();
                additionalInfo.put("", "Exception occured while retrieving CSClient object!");
              //  new ErrorNotificationHandler(CSUtils.class.getName(), SystemErrorEnum.GENERAL_ERROR, e.getMessage(), additionalInfo).execute();
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
            	 System.out.println("ClassNotFoundException : "+e);
				// TODO Auto-generated catch block
				e.printStackTrace();
            } catch (Exception e) {
            	 System.out.println("Exception : "+e);
			} 

    	} else {
    		 System.out.println("Session is null");
    	}*/
    }

    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /** Returns a short description of the servlet.
     */
    public String getServletInfo()
    {
        return "This Servlet handles requests to /urlextendedtask, connects to the CS SOAP service to get task info and instantiates the correct handler.";
    }
    /*
    public CSClient getCSClientFromSession(String sessionString) {

        System.out.println("Session String: " + sessionString);

        Properties properties = new Properties();
        properties.setProperty(
                "com.interwoven.cssdk.factory.CSFactory",
                "com.interwoven.cssdk.factory.CSJavaFactory");

        properties.setProperty("defaultTSServer", "preproduction-cloud.teamsite.aws.buyatoyota.com");
        properties.setProperty("ts.server.os", "lin");
        CSClient csclient = null;
        try {
        	 System.out.println("Factory initializing ..... " );
        CSFactory factory = CSFactory.getFactory(properties);
        System.out.println("Factory initialized: " + factory);

       
       
            csclient = factory.getClient(
                    sessionString, // ts session
                    Locale.getDefault(),    // Locale
                    "CSRemoteClient",        // Application Context
                    null);                    // TeamSite HostName [ will be read from properties object ]
            
            System.out.println("csclient : " + csclient);
        } catch (CSException e) {
        	System.out.println("CSException : "+e);
        	//LOGGER.error("Error : "+e);
        	
        } catch (Exception e) {
        	System.out.println("Error : "+e);
        }

        return csclient;
        ///////////////////////////////////////////////////////////////////////////////

    }*/
}

