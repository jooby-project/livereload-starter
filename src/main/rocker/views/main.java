package views;

import java.io.IOException;
import com.fizzed.rocker.ForIterator;
import com.fizzed.rocker.RenderingException;
import com.fizzed.rocker.RockerContent;
import com.fizzed.rocker.RockerOutput;
import com.fizzed.rocker.runtime.DefaultRockerTemplate;
import com.fizzed.rocker.runtime.PlainTextUnloadedClassLoader;

/*
 * Auto generated code to render template views/main.rocker.html
 * Do not edit this file. Changes will eventually be overwritten by Rocker parser!
 */
public class main extends com.fizzed.rocker.runtime.DefaultRockerModel {

    static public final com.fizzed.rocker.ContentType CONTENT_TYPE = com.fizzed.rocker.ContentType.HTML;
    static public final String TEMPLATE_NAME = "main.rocker.html";
    static public final String TEMPLATE_PACKAGE_NAME = "views";
    static public final String HEADER_HASH = "-635070772";
    static public final long MODIFIED_AT = 1489757281000L;
    static public final String[] ARGUMENT_NAMES = { "title" };

    // argument @ [1:2]
    private String title;
    // argument @ [1:2]
    private RockerContent content;

    public main title(String title) {
        this.title = title;
        return this;
    }

    public String title() {
        return this.title;
    }

    public main __body(RockerContent content) {
        this.content = content;
        return this;
    }

    public RockerContent __body() {
        return this.content;
    }

    static public main template(String title) {
        return new main()
            .title(title);
    }

    @Override
    protected DefaultRockerTemplate buildTemplate() throws RenderingException {
        // optimized for performance (via rocker.optimize flag; no auto reloading)
        return new Template(this);
    }

    static public class Template extends org.jooby.rocker.RequestRockerTemplate {

        // <html>\n    <head>\n        <title>
        static private final byte[] PLAIN_TEXT_0_0;
        // </title>\n    </head>\n    <body>\n    
        static private final byte[] PLAIN_TEXT_1_0;
        // \n    </body>\n</html>\n
        static private final byte[] PLAIN_TEXT_2_0;

        static {
            PlainTextUnloadedClassLoader loader = PlainTextUnloadedClassLoader.tryLoad(main.class.getClassLoader(), main.class.getName() + "$PlainText", "UTF-8");
            PLAIN_TEXT_0_0 = loader.tryGet("PLAIN_TEXT_0_0");
            PLAIN_TEXT_1_0 = loader.tryGet("PLAIN_TEXT_1_0");
            PLAIN_TEXT_2_0 = loader.tryGet("PLAIN_TEXT_2_0");
        }

        // argument @ [1:2]
        protected final String title;
        // argument @ [1:2]
        protected final RockerContent content;

        public Template(main model) {
            super(model);
            __internal.setCharset("UTF-8");
            __internal.setContentType(CONTENT_TYPE);
            __internal.setTemplateName(TEMPLATE_NAME);
            __internal.setTemplatePackageName(TEMPLATE_PACKAGE_NAME);
            this.title = model.title();
            this.content = model.__body();
        }

        @Override
        protected void __doRender() throws IOException, RenderingException {
            // PlainText @ [1:41]
            __internal.aboutToExecutePosInTemplate(1, 41);
            __internal.writeValue(PLAIN_TEXT_0_0);
            // ValueExpression @ [5:16]
            __internal.aboutToExecutePosInTemplate(5, 16);
            __internal.renderValue(title, false);
            // PlainText @ [5:22]
            __internal.aboutToExecutePosInTemplate(5, 22);
            __internal.writeValue(PLAIN_TEXT_1_0);
            // ValueExpression @ [8:5]
            __internal.aboutToExecutePosInTemplate(8, 5);
            __internal.renderValue(content, false);
            // PlainText @ [8:13]
            __internal.aboutToExecutePosInTemplate(8, 13);
            __internal.writeValue(PLAIN_TEXT_2_0);
        }
    }

    private static class PlainText {

        static private final String PLAIN_TEXT_0_0 = "<html>\n    <head>\n        <title>";
        static private final String PLAIN_TEXT_1_0 = "</title>\n    </head>\n    <body>\n    ";
        static private final String PLAIN_TEXT_2_0 = "\n    </body>\n</html>\n";

    }

}
