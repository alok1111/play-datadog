package controllers;

import com.play.datadog.NonStaticLogComponent;
import com.play.datadog.StaticLogComponent;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;

public class Application extends Controller {

    private StaticLogComponent staticLogComponent;
    private NonStaticLogComponent nonStaticLogComponent;

    @Inject
    public Application(StaticLogComponent staticLogComponent, NonStaticLogComponent nonStaticLogComponent) {
        this.staticLogComponent = staticLogComponent;
        this.nonStaticLogComponent = nonStaticLogComponent;
    }

    public Result index() {
        staticLogComponent.writeToLog();
        nonStaticLogComponent.writeToLog();
        return ok();
    }

}
