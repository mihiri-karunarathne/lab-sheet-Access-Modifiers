class AccessModifiersDemo{
    private int privateVar;
    double defaultVar;
    protected boolean protectedVar;
    public String publicVar;

    
    public int getPrivateVar(){
     return privateVar;
    }
    public void setprivateVar(int var){
     privateVar = var;
    }
    double getDefaultVar(){
        return defaultVar;
    }
    protected boolean getProtectedVar(){
        return protectedVar;
    }
    public String getPublicVar(){
        return publicVar;
    }

}