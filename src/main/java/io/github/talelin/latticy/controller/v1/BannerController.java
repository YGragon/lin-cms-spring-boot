package io.github.talelin.latticy.controller.v1;

import io.github.talelin.autoconfigure.exception.NotFoundException;
import io.github.talelin.core.annotation.GroupRequired;
import io.github.talelin.core.annotation.PermissionMeta;
import io.github.talelin.latticy.dto.book.CreateOrUpdateBookDTO;
import io.github.talelin.latticy.model.BookDO;
import io.github.talelin.latticy.service.BookService;
import io.github.talelin.latticy.vo.CreatedVO;
import io.github.talelin.latticy.vo.DeletedVO;
import io.github.talelin.latticy.vo.UpdatedVO;
import jdk.nashorn.internal.ir.debug.JSONWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Positive;
import java.util.List;

/**
 * @author pedro@TaleLin
 * @author Juzi@TaleLin
 */
@RestController
@RequestMapping("/v1/banner")
@Validated
public class BannerController {
    @GetMapping("/list")
    public String getBannerList() {
        String data = "[\n" +
                "        {\n" +
                "            \"desc\": \"我们支持订阅啦~\",\n" +
                "            \"id\": 30,\n" +
                "            \"imagePath\": \"https://www.wanandroid.com/blogimgs/42da12d8-de56-4439-b40c-eab66c227a4b.png\",\n" +
                "            \"isVisible\": 1,\n" +
                "            \"order\": 0,\n" +
                "            \"title\": \"我们支持订阅啦~\",\n" +
                "            \"type\": 0,\n" +
                "            \"url\": \"https://www.wanandroid.com/blog/show/3352\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"desc\": \"\",\n" +
                "            \"id\": 6,\n" +
                "            \"imagePath\": \"https://www.wanandroid.com/blogimgs/62c1bd68-b5f3-4a3c-a649-7ca8c7dfabe6.png\",\n" +
                "            \"isVisible\": 1,\n" +
                "            \"order\": 1,\n" +
                "            \"title\": \"我们新增了一个常用导航Tab~\",\n" +
                "            \"type\": 1,\n" +
                "            \"url\": \"https://www.wanandroid.com/navi\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"desc\": \"一起来做个App吧\",\n" +
                "            \"id\": 10,\n" +
                "            \"imagePath\": \"https://www.wanandroid.com/blogimgs/50c115c2-cf6c-4802-aa7b-a4334de444cd.png\",\n" +
                "            \"isVisible\": 1,\n" +
                "            \"order\": 1,\n" +
                "            \"title\": \"一起来做个App吧\",\n" +
                "            \"type\": 1,\n" +
                "            \"url\": \"https://www.wanandroid.com/blog/show/2\"\n" +
                "        }\n" +
                "    ]";
        return data;
    }
}
