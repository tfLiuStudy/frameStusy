package cn.al.myBatisSelf.utils;

import cn.al.myBatisSelf.basic.Configuration;
import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * xml解析
 */
public class XMLConfigBuilder {

    /**
     * xml解析
     * @param is
     * @return
     */
    public static Configuration buildConfiguration(InputStream is) throws JDOMException, IOException {
        // 创建SAXBuilder对象
        SAXBuilder saxBuilder = new SAXBuilder();
        // 将输入流加载到build中
        Document document = saxBuilder.build(is);
        // 获取根节点
        Element rootElement = document.getRootElement();
        //5.获取子节点configuration
        List<Element> children = rootElement.getChildren();
        for (Element child : children) {
            // environments
            List<Element> envirs = child.getChildren();
            for (Element envir : envirs) {
                // environment
                List<Element> data = envir.getChildren();
                Element dataSource = data.get(1);
                List<Element> props = dataSource.getChildren();
                for (Element prop : props) {
                    List<Attribute> att = prop.getAttributes();
                    for (Attribute attribute : att) {
                        System.out.println(attribute.getName() + "---" + attribute.getValue());
                    }
                }
            }
        }
        return null;
    }
}
