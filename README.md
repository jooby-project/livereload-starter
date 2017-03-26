[![Build Status](https://travis-ci.org/jooby-project/livereload-starter.svg?branch=master)](https://travis-ci.org/jooby-project/livereload-starter)
# livereload

Starter kit for [LiveReload](http://livereload.com/) protocol.

## quick preview

This project contains a simple static application.

[App.java](https://github.com/jooby-project/livereload-starter/blob/master/src/main/java/starter/lr/App.java):

```java
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
```

Go to `http://localhost:8080` wait for page load, then go to  `css/styles.css` and edit the `h1` style.


## run

    mvn jooby:run

## help

* Read the [module documentation](http://jooby.org/doc/livereload)
* Join the [channel](https://gitter.im/jooby-project/jooby)
* Join the [group](https://groups.google.com/forum/#!forum/jooby-project)
