package starter.lr;

import org.jooby.Jooby;
import org.jooby.json.Jackson;
import org.jooby.livereload.LiveReload;

public class App extends Jooby {

  {
    /** Install Jackson: */
    use(new Jackson());

    /** Install LiveReload: */
    use(new LiveReload());

    /** CSS files: */
    assets("/css/**");

    /** Home page: */
    assets("/", "index.html");
  }

  public static void main(final String[] args) {
    run(App::new, args);
  }

}
