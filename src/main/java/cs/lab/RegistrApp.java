package cs.lab;

public class RegistrApp{
    FinalUser CE2A,DGA,CounterDocentes,CounterAlumnos;
    String title;
    String link;
    public RegistrApp(){}
    public boolean nameuser(String Name){
        boolean validate=false;
        if(Name!=null){
            boolean size=(Name.length()>4 && Name.length()<20);
            boolean space=Name.contains(" ");
            validate=(size&&space);
        }
        return validate;
    }
    public void validate(String titled,String linkd) {
        title=titled;
        link=linkd;
        report(validatedescription(title),validatelink(link));
    }
    public boolean validatedescription(String title){
        boolean validate=true;
        String[]parts= title.split(",");
        if(parts.length!=5){
            validate=false;
        }
        return validate;
    }
    public boolean validatelink(String Link) {
        boolean validate = true;
        String compare="https://utec.zoom.us/rec/share/”";
        if(!Link.contains(compare)){
            validate=false;
        }
        return validate;
    }
    public void report(boolean a,boolean b){

    }


}
