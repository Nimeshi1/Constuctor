public class Programme {

        String languages;
        Programme() {
            this.languages = "Java";
        }
        Programme(String languages) {
            this.languages = languages;
        }
        public void getName(){
            System.out.println("Programming language:" + this.languages);
        }
        public static void main(String[]args) {
            Programme pl = new Programme();
            Programme pl1 = new Programme( "Python");
            pl.getName();
            pl1.getName();
        }
    }
