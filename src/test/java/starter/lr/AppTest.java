package starter.lr;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;

import org.jooby.test.JoobyRule;
import org.junit.ClassRule;
import org.junit.Test;

public class AppTest {

  @ClassRule
  public static JoobyRule app = new JoobyRule(new App());

  @Test
  public void shouldGetHomePage() {
    get("/")
        .then()
        .assertThat()
        .body(equalTo(
            "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<meta charset=\"UTF-8\">\n" +
                "<title>LiveReload in Action</title>\n" +
                "<link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\">\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "  <h1>LiveReload in action!</h1>\n" +
                "  <script src=\"/livereload.js\"></script>\n" +
                "</body>\n" +
                "\n" +
                "</html>\n"))
        .statusCode(200)
        .contentType("text/html;charset=UTF-8");
  }

}
