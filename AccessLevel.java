public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        String output = "";

        for(int i = 0; i < rights.length; i += 1){
            if(rights[i] >= minPermission){
                output += "A";
            } else{
                output += "D";
            }
        }

        return output;
    }
 }