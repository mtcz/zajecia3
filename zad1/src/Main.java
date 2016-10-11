public class Main {

    public static void main(String[] args) {
        System.out.println("");
        try {
            String o = null;
            if (o == null)
                throw new mojBlad();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (Throwable t) {
            System.out.println(t.getMessage());
        } finally {
            System.out.println("koniec programu");
        }

    }
}
