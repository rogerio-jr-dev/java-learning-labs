import java.util.Stack;

class Browser {

    private String currentPage;
    private Stack<String> backStack;
    private Stack<String> forwardStack;

    public Browser() {
        this.currentPage = "home";
        this.backStack = new Stack<>();
        this.forwardStack = new Stack<>();
    }

    public void access(String url) {
        backStack.push(currentPage);
        currentPage = url;
 
        forwardStack.clear();
    }

    public void back() {
        if (backStack.isEmpty()) {
            throw new RuntimeException("Back error");
        }

        forwardStack.push(currentPage);
        currentPage = backStack.pop();
    }

    public void forward() {
        if (forwardStack.isEmpty()) {
            throw new RuntimeException("Forward error");
        }

        backStack.push(currentPage);
        currentPage = forwardStack.pop();
    }

    public String getCurrentPage() {
        return currentPage;
    }
}

public class SistemaNavegacao {

    static void testNavigation(Browser browser, String[] commands) {

        for (String cmd : commands) {

            if (cmd.equals("get-current")) {
                System.out.println(browser.getCurrentPage());
                continue;
            }

            if (cmd.startsWith("access")) {
                String[] partes = cmd.split(",", 2);
                String url = partes[1];
                browser.access(url);
                continue;
            }

            if (cmd.equals("back")) {
                try {
                    browser.back();
                } catch (RuntimeException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                continue;
            }

            if (cmd.equals("forward")) {
                try {
                    browser.forward();
                } catch (RuntimeException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
    }
 
    public static void main(String[] args) throws Exception {

        // Exemplo de teste manual:
        String[] commands = {
            "get-current",
            "access,https://amazon.com",
            "access,https://cnn.com",
            "get-current",
            "back",
            "get-current",
            "back",
            "get-current",
            "back"
        };

        Browser browser = new Browser();
        testNavigation(browser, commands);
    }
}
