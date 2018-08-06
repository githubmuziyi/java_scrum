package muzi.scrum.fileOperation;

import java.io.File;

/**
 * 文件解析接口
 */
public interface FileParse {

    FileMeta fileParse(File file, FileParseResover resover);
}
