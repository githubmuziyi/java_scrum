package muzi.scrum.fileOperation;

/**
 * 银行excel解析器
 */
abstract class BankExcelResover implements FileParseResover {

    /**
     * 默认解析器
     * @return
     */
    public FileMeta defaultResover() {
        return null;
    }
}
