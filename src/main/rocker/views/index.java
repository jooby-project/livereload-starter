package views;

import java.io.IOException;
import com.fizzed.rocker.ForIterator;
import com.fizzed.rocker.RenderingException;
import com.fizzed.rocker.RockerContent;
import com.fizzed.rocker.RockerOutput;
import com.fizzed.rocker.runtime.DefaultRockerTemplate;
import com.fizzed.rocker.runtime.PlainTextUnloadedClassLoader;

/*
 * Auto generated code to render template views/index.rocker.html
 * Do not edit this file. Changes will eventually be overwritten by Rocker parser!
 */
public class index extends com.fizzed.rocker.runtime.DefaultRockerModel {

    static public final com.fizzed.rocker.ContentType CONTENT_TYPE = com.fizzed.rocker.ContentType.HTML;
    static public final String TEMPLATE_NAME = "index.rocker.html";
    static public final String TEMPLATE_PACKAGE_NAME = "views";
    static public final String HEADER_HASH = "973482035";
    static public final long MODIFIED_AT = 1489781435000L;
    static public final String[] ARGUMENT_NAMES = { "message" };

    // argument @ [1:2]
    private String message;

    public index message(String message) {
        this.message = message;
        return this;
    }

    public String message() {
        return this.message;
    }

    static public index template(String message) {
        return new index()
            .message(message);
    }

    @Override
    protected DefaultRockerTemplate buildTemplate() throws RenderingException {
        // optimized for performance (via rocker.optimize flag; no auto reloading)
        return new Template(this);
    }

    static public class Template extends org.jooby.rocker.RequestRockerTemplate {

        //     <h1>Hello 
        static private final byte[] PLAIN_TEXT_0_0;
        // !!! 
        static private final byte[] PLAIN_TEXT_1_0;
        // </h1>\n
        static private final byte[] PLAIN_TEXT_2_0;

        static {
            PlainTextUnloadedClassLoader loader = PlainTextUnloadedClassLoader.tryLoad(index.class.getClassLoader(), index.class.getName() + "$PlainText", "UTF-8");
            PLAIN_TEXT_0_0 = loader.tryGet("PLAIN_TEXT_0_0");
            PLAIN_TEXT_1_0 = loader.tryGet("PLAIN_TEXT_1_0");
            PLAIN_TEXT_2_0 = loader.tryGet("PLAIN_TEXT_2_0");
        }

        // argument @ [1:2]
        protected final String message;

        public Template(index model) {
            super(model);
            __internal.setCharset("UTF-8");
            __internal.setContentType(CONTENT_TYPE);
            __internal.setTemplateName(TEMPLATE_NAME);
            __internal.setTemplatePackageName(TEMPLATE_PACKAGE_NAME);
            this.message = model.message();
        }

        @Override
        protected void __doRender() throws IOException, RenderingException {
            // ValueClosureBegin @ [3:1]
            __internal.aboutToExecutePosInTemplate(3, 1);
            __internal.renderValue(views.main.template("Home").__body(() -> {
                // PlainText @ [3:34]
                __internal.aboutToExecutePosInTemplate(3, 34);
                __internal.writeValue(PLAIN_TEXT_0_0);
                // ValueExpression @ [4:15]
                __internal.aboutToExecutePosInTemplate(4, 15);
                __internal.renderValue(message, false);
                // PlainText @ [4:23]
                __internal.aboutToExecutePosInTemplate(4, 23);
                __internal.writeValue(PLAIN_TEXT_1_0);
                // ValueExpression @ [4:27]
                __internal.aboutToExecutePosInTemplate(4, 27);
                __internal.renderValue(locals.get("username"), false);
                // PlainText @ [4:50]
                __internal.aboutToExecutePosInTemplate(4, 50);
                __internal.writeValue(PLAIN_TEXT_2_0);
                // ValueClosureEnd @ [3:1]
                __internal.aboutToExecutePosInTemplate(3, 1);
            }), false); // value closure end @ [3:1]
        }
    }

    private static class PlainText {

        static private final String PLAIN_TEXT_0_0 = "    <h1>Hello ";
        static private final String PLAIN_TEXT_1_0 = "!!! ";
        static private final String PLAIN_TEXT_2_0 = "</h1>\n";

    }

}
