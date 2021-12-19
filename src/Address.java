import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String flat;
    public void setAddress(String str) {
        int comma=0;
        for (int i=0;i<str.length();i++) {
            if (str.charAt(i)==',') comma+=1;
        }
        if (comma==6)
        {
            String[] words = str.split(", ");
            int k = 0;
            for (String word : words) {
                if (k == 0) {
                    country = word;
                    k += 1;
                    continue;
                }
                if (k == 1) {
                    region = word;
                    k += 1;
                    continue;
                }
                if (k == 2) {
                    city = word;
                    k += 1;
                    continue;
                }
                if (k == 3) {
                    street = word;
                    k += 1;
                    continue;
                }
                if (k == 4) {
                    house = word;
                    k += 1;
                    continue;
                }
                if (k == 5) {
                    building = word;
                    k += 1;
                    continue;
                }
                if (k == 6) {
                    flat = word;
                    k += 1;
                    continue;
                }
            }
        }
        else {
            int k1=0;
            StringTokenizer st = new StringTokenizer(str,",;.-");

            while (st.hasMoreTokens())
            {
                String token = st.nextToken();
                if (k1 == 0) {
                    country = token;
                    k1 += 1;
                    continue;
                }
                if (k1 == 1) {
                    token=token.trim();

                    region = token;
                    k1 += 1;
                    continue;
                }
                if (k1 == 2) {
                    token=token.trim();
                    city = token;
                    k1 += 1;
                    continue;
                }
                if (k1 == 3) {
                    token=token.trim();
                    street = token;
                    k1 += 1;
                    continue;
                }
                if (k1 == 4) {
                    token=token.trim();
                    house = token;
                    k1 += 1;
                    continue;
                }
                if (k1 == 5) {
                    token=token.trim();
                    building = token;
                    k1+= 1;
                    continue;
                }
                if (k1 == 6) {
                    token=token.trim();
                    flat = token;
                    k1 += 1;
                    continue;
                }
            }

        }
    }
    public void getAddress() {
        System.out.println(country);
        System.out.println(region);
        System.out.println(city);
        System.out.println(street);
        System.out.println(house);
        System.out.println(building);
        System.out.println(flat);
    }
}
