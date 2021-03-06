
/**
 * UserManagementWSMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package t3.sos.fi.upm.es;

        /**
        *  UserManagementWSMessageReceiverInOut message receiver
        */

        public class UserManagementWSMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        UserManagementWSSkeleton skel = (UserManagementWSSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("login".equals(methodName)){
                
                es.upm.fi.sos.t3.usermanagement.Response response6 = null;
	                        es.upm.fi.sos.t3.usermanagement.User wrappedParam =
                                                             (es.upm.fi.sos.t3.usermanagement.User)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    es.upm.fi.sos.t3.usermanagement.User.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               response6 =
                                                   
                                                   
                                                         skel.login(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), response6, false, new javax.xml.namespace.QName("http://usermanagement.t3.sos.fi.upm.es",
                                                    "login"));
                                    } else 

            if("addUser".equals(methodName)){
                
                es.upm.fi.sos.t3.usermanagement.Response response8 = null;
	                        es.upm.fi.sos.t3.usermanagement.User wrappedParam =
                                                             (es.upm.fi.sos.t3.usermanagement.User)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    es.upm.fi.sos.t3.usermanagement.User.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               response8 =
                                                   
                                                   
                                                         skel.addUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), response8, false, new javax.xml.namespace.QName("http://usermanagement.t3.sos.fi.upm.es",
                                                    "addUser"));
                                    } else 

            if("changePassword".equals(methodName)){
                
                es.upm.fi.sos.t3.usermanagement.Response response10 = null;
	                        es.upm.fi.sos.t3.usermanagement.PasswordPair wrappedParam =
                                                             (es.upm.fi.sos.t3.usermanagement.PasswordPair)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    es.upm.fi.sos.t3.usermanagement.PasswordPair.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               response10 =
                                                   
                                                   
                                                         skel.changePassword(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), response10, false, new javax.xml.namespace.QName("http://usermanagement.t3.sos.fi.upm.es",
                                                    "changePassword"));
                                    } else 

            if("removeUser".equals(methodName)){
                
                es.upm.fi.sos.t3.usermanagement.Response response12 = null;
	                        es.upm.fi.sos.t3.usermanagement.Username wrappedParam =
                                                             (es.upm.fi.sos.t3.usermanagement.Username)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    es.upm.fi.sos.t3.usermanagement.Username.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               response12 =
                                                   
                                                   
                                                         skel.removeUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), response12, false, new javax.xml.namespace.QName("http://usermanagement.t3.sos.fi.upm.es",
                                                    "removeUser"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.usermanagement.User param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.usermanagement.User.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.usermanagement.Response param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.usermanagement.Response.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.usermanagement.PasswordPair param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.usermanagement.PasswordPair.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.usermanagement.Username param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.usermanagement.Username.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.fi.sos.t3.usermanagement.Response param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.fi.sos.t3.usermanagement.Response.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.upm.fi.sos.t3.usermanagement.Response wraplogin(){
                                es.upm.fi.sos.t3.usermanagement.Response wrappedElement = new es.upm.fi.sos.t3.usermanagement.Response();
                                return wrappedElement;
                         }
                    
                         private es.upm.fi.sos.t3.usermanagement.Response wrapaddUser(){
                                es.upm.fi.sos.t3.usermanagement.Response wrappedElement = new es.upm.fi.sos.t3.usermanagement.Response();
                                return wrappedElement;
                         }
                    
                         private es.upm.fi.sos.t3.usermanagement.Response wrapchangePassword(){
                                es.upm.fi.sos.t3.usermanagement.Response wrappedElement = new es.upm.fi.sos.t3.usermanagement.Response();
                                return wrappedElement;
                         }
                    
                         private es.upm.fi.sos.t3.usermanagement.Response wrapremoveUser(){
                                es.upm.fi.sos.t3.usermanagement.Response wrappedElement = new es.upm.fi.sos.t3.usermanagement.Response();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (es.upm.fi.sos.t3.usermanagement.User.class.equals(type)){
                
                           return es.upm.fi.sos.t3.usermanagement.User.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.usermanagement.Response.class.equals(type)){
                
                           return es.upm.fi.sos.t3.usermanagement.Response.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.usermanagement.User.class.equals(type)){
                
                           return es.upm.fi.sos.t3.usermanagement.User.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.usermanagement.Response.class.equals(type)){
                
                           return es.upm.fi.sos.t3.usermanagement.Response.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.usermanagement.PasswordPair.class.equals(type)){
                
                           return es.upm.fi.sos.t3.usermanagement.PasswordPair.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.usermanagement.Response.class.equals(type)){
                
                           return es.upm.fi.sos.t3.usermanagement.Response.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.usermanagement.Username.class.equals(type)){
                
                           return es.upm.fi.sos.t3.usermanagement.Username.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.usermanagement.Response.class.equals(type)){
                
                           return es.upm.fi.sos.t3.usermanagement.Response.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    