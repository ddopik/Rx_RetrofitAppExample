package presenter.netWork.retroFit_models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by ddopik on 9/10/2017.
 */
@Root(name = "title")
public class CnnTitle {
    @Element
    String __cdata;
}
