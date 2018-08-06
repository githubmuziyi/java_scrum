package muzi.scrum.fileOperation;

/**
 * 文件元信息
 */
public class FileMeta<T> {

    /**
     * 文件md5值
     */
    String md5;

    /**
     * 文件名称
     */
    String fileName;

    /**
     * 文件大小
     */
    Integer size;

    /**
     * 文件内容
     */
    T content;

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "FileMeta{" +
                "md5='" + md5 + '\'' +
                ", fileName='" + fileName + '\'' +
                ", size=" + size +
                ", content=" + content +
                '}';
    }
}
