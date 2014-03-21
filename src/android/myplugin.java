package com.example.simplePlugin; 


import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;

import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;



public class simplePlugin extends CordovaPlugin {

public static final String ACTION_EX_PLUGIN = "actionExamPlugin"; 

@Overridepublic boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException 
{ 

try{

if ACTION_EX_PLUGIN.equals(action)) {              
            String message = args.getString(0);                
            this.actionExamPlugin(message, callbackContext);                
            return true;

}
    
return false;


}

private void echo(String message, CallbackContext callbackContext) 
{            
if (message != null && message.length() > 0) 
{                
callbackContext.success(message);            
} 
else 
{                
callbackContext.error("Expected one non-empty string argument.");            
}        
}


}