var expluginNew =  
{   

createEvent: function(successCallback, errorCallback)
{        
cordova.exec(            
successCallback, // success callback function            
errorCallback, // error callback function            
'simplePlugin', // mapped to our native Java class called "Calendar"            
'actionExamPlugin', // with this action name
);
}
}

module.exports = expluginNew;