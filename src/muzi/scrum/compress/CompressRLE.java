package muzi.scrum.compress;

public class CompressRLE {

    public static void main(String[] args) {
        String sourceTxt = "AAAAAABBCDDEEEEEF";
        String compressTxt = CompressRLE.compress(sourceTxt);
        float sum = (float) compressTxt.getBytes().length / (float) sourceTxt.getBytes().length;
        System.out.println("元内容： " + sourceTxt);
        System.out.println("压缩后内容： " + compressTxt);
        System.out.println("压缩率： " + sum * 100 + "%");
    }

    public static String compress(String source) {
        StringBuffer dest = new StringBuffer();
        for (int i = 0; i < source.length(); i++) {
            int runLength = 1;
            // 判断是否超出字符串总长度 && 当前字符与其下一个字符是否相等
            while (i+1 < source.length() && source.charAt(i) == source.charAt(i+1)) {
                runLength++;
                i++;
            }
            dest.append(source.charAt(i));
            dest.append(runLength);
        }
        return dest.toString();
    }
}
