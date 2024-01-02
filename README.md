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