
class Main {
  public static void main(String[] args) {

    //call your method and print the returned result
    System.out.println(getRandomPassword());
  }

public static String getRandomPassword(){

char up1 = (char)(65 + (Math.random()) * 26);
char up2 = (char)(65 + (Math.random()) * 26);
char up3 = (char)(65 + (Math.random()) * 26);
char up4 = (char)(65 + (Math.random()) * 26);
char up5 = (char)(65 + (Math.random()) * 26);
char up6 = (char)(65 + (Math.random()) * 26);
String upper = "" + up1 + up2 + up3 + up4 + up5 + up5 + up6;
return upper;
  
}


  
}