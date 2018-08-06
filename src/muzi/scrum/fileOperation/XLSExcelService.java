package muzi.scrum.fileOperation;

import java.io.File;

/**
 * XLSExcel服务类
 */
public class XLSExcelService extends BaseExcelService {

    @Override
    public FileMeta fileParse(File file, FileParseResover resover) {
        return resover.resover(file);
    }
}
