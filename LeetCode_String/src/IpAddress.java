public class IpAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String[] array=address.split("");

        address =ipAddress(address);
        System.out.println(address);
    }
    public static String ipAddress(String address){
        StringBuilder builder= new StringBuilder();
        for(int i=0;i<address.length()-1; i++){
           // System.out.println(address.charAt(i));
            if (address.charAt(i)=='.'){
                builder.append('[');
            }
            else{
                builder.append(address.charAt(i));
            }
        }
        return builder.toString();
    }
}
