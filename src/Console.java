import java.io.IOException;
public class Console {

    public static void limpar() {

        try {

            if (System.getProperty("os.name").contains("Windows")) {

                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();

            } else {

                System.out.print("\033[H\033[2J");
                System.out.flush();

            }

        } catch (IOException | InterruptedException e) {

            System.out.println("Erro ao limpar console.");

        }
    }
}
