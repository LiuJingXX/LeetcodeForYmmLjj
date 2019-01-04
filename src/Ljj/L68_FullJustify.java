package Ljj;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName L68_FullJustify
 * @Description 给定一个单词数组和一个长度 maxWidth，重新排版单词，使其成为每行恰好有 maxWidth 个字符，且左右两端对齐的文本。
 *
 * 你应该使用“贪心算法”来放置给定的单词；也就是说，尽可能多地往每行中放置单词。必要时可用空格 ' ' 填充，使得每行恰好有 maxWidth 个字符。
 *
 * 要求尽可能均匀分配单词间的空格数量。如果某一行单词间的空格不能均匀分配，则左侧放置的空格数要多于右侧的空格数。
 *
 * 文本的最后一行应为左对齐，且单词之间不插入额外的空格。
 * @Author LiuJJ
 * @Date 2019/1/3 10:19
 * @Version 1.0
 **/
public class L68_FullJustify {
    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new LinkedList<String>();
        StringBuilder line = new StringBuilder();
        int blanknum = 0;
        int wordnum = 0;
        int remainer = 0;
        int index = 0;
        for(String i : words){
            if(line.length()==0){
                line.append(i);
            }else if(line.length()+1+i.length()<=maxWidth){
                line.append(" ");
                line.append(i);
            }else{
                if(wordnum==1){
                    while(line.length()<maxWidth){
                        line.append(" ");
                    }
                }else{
                    blanknum = (maxWidth - line.length())/(wordnum-1);
                    remainer = (maxWidth - line.length())%(wordnum-1);
                    line.delete(0, line.length());
                    for(int k=index-wordnum;k<index;k++){
                        line.append(words[k]);
                        if(line.length()<maxWidth){
                            for(int j=0;j<(k-index+wordnum<remainer?blanknum+2:blanknum+1);j++){
                                line.append(" ");
                            }
                        }
                    }
                }
                res.add(line.toString());
                line.delete(0,line.length());
                line.append(i);
                wordnum=0;
            }
            index++;
            wordnum++;
        }
        while(line.length()<maxWidth){
            line.append(" ");
        }
        res.add(line.toString());
        return res;
    }

    public static void main(String[] args) {
        String[] words = new String[]{"This", "is", "an", "example", "of", "text", "justification."};
        System.out.println(fullJustify(words,16));
    }
}
