# LeetCode生成模板
${question.content}
package leetcode.editor.cn;

/**
* java:[${question.frontendQuestionId}]${question.title}
* date:$!velocityTool.date()
  */
  public class T${question.frontendQuestionId}_$!velocityTool.camelCaseName(${question.titleSlug}) {

  public static void main(String[] args) {
  Solution solution = new T${question.frontendQuestionId}_$!velocityTool.camelCaseName(${question.titleSlug})().new Solution();
  // TO TEST
  System.out.println();
  }

  ${question.code}
}

# token
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

# 免密连接git
git remote set-url origin https://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@github.com/qdwyg2013/leetcodeCodeTop.git
