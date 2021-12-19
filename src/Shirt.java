public class Shirt {
    private  String number;
    private  String name;
    private  String colour;
    private  String size;

    public  void setShirt(String a) {
            String[] words = a.split(",");
            int k = 0;
            for (String word : words) {
                if (k == 0) {
                    number = word;
                    k += 1;
                    continue;
                }
                if (k == 1) {
                    name = word;
                    k += 1;
                    continue;
                }
                if (k == 2) {
                    colour = word;
                    k += 1;
                    continue;
                }
                if (k == 3) {
                    size = word;
                    k += 1;
                    continue;
                }
            }


    }

    @Override
    public String toString() {
        return "Shirt{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
