package server.mall.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class AddDto {
    private String proname;
    private String simpledesc;
    private String keyword;
    private String type;
    private String shopyprice;
    private String shopxprice;
    private String shopcount;
    private String shopgg;
    private String on;
    private String dis;
    private MultipartFile shopimg;
    private String shopdesc;
}
