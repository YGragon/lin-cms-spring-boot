package io.github.talelin.latticy.controller.v1;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pedro@TaleLin
 * @author Juzi@TaleLin
 */
@RestController
@RequestMapping("/v1/article")
@Validated
public class ArticleController {
    @GetMapping("/list")
    public String getArticleList() {
        String data = "[\n" +
                "            {\n" +
                "                \"apkLink\": \"\",\n" +
                "                \"audit\": 1,\n" +
                "                \"author\": \"\",\n" +
                "                \"canEdit\": false,\n" +
                "                \"chapterId\": 502,\n" +
                "                \"chapterName\": \"自助\",\n" +
                "                \"collect\": false,\n" +
                "                \"courseId\": 13,\n" +
                "                \"desc\": \"\",\n" +
                "                \"descMd\": \"\",\n" +
                "                \"envelopePic\": \"\",\n" +
                "                \"fresh\": true,\n" +
                "                \"host\": \"\",\n" +
                "                \"id\": 22457,\n" +
                "                \"link\": \"https://blog.csdn.net/zxm528/article/details/94825922?spm=1001.2014.3001.5501\",\n" +
                "                \"niceDate\": \"1天前\",\n" +
                "                \"niceShareDate\": \"1天前\",\n" +
                "                \"origin\": \"\",\n" +
                "                \"prefix\": \"\",\n" +
                "                \"projectLink\": \"\",\n" +
                "                \"publishTime\": 1650246530000,\n" +
                "                \"realSuperChapterId\": 493,\n" +
                "                \"selfVisible\": 0,\n" +
                "                \"shareDate\": 1650246530000,\n" +
                "                \"shareUser\": \"zxm528\",\n" +
                "                \"superChapterId\": 494,\n" +
                "                \"superChapterName\": \"广场Tab\",\n" +
                "                \"tags\": [],\n" +
                "                \"title\": \"低功耗蓝牙开发之建立连接\",\n" +
                "                \"type\": 0,\n" +
                "                \"userId\": 3487,\n" +
                "                \"visible\": 1,\n" +
                "                \"zan\": 0\n" +
                "            },\n" +
                "            {\n" +
                "                \"apkLink\": \"\",\n" +
                "                \"audit\": 1,\n" +
                "                \"author\": \"鸿洋\",\n" +
                "                \"canEdit\": false,\n" +
                "                \"chapterId\": 408,\n" +
                "                \"chapterName\": \"鸿洋\",\n" +
                "                \"collect\": false,\n" +
                "                \"courseId\": 13,\n" +
                "                \"desc\": \"\",\n" +
                "                \"descMd\": \"\",\n" +
                "                \"envelopePic\": \"\",\n" +
                "                \"fresh\": false,\n" +
                "                \"host\": \"\",\n" +
                "                \"id\": 22462,\n" +
                "                \"link\": \"https://mp.weixin.qq.com/s/sa8vLJ_3Osh-IqKRnUgfQw\",\n" +
                "                \"niceDate\": \"1天前\",\n" +
                "                \"niceShareDate\": \"10小时前\",\n" +
                "                \"origin\": \"\",\n" +
                "                \"prefix\": \"\",\n" +
                "                \"projectLink\": \"\",\n" +
                "                \"publishTime\": 1650211200000,\n" +
                "                \"realSuperChapterId\": 407,\n" +
                "                \"selfVisible\": 0,\n" +
                "                \"shareDate\": 1650294950000,\n" +
                "                \"shareUser\": \"\",\n" +
                "                \"superChapterId\": 408,\n" +
                "                \"superChapterName\": \"公众号\",\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"name\": \"公众号\",\n" +
                "                        \"url\": \"/wxarticle/list/408/1\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"title\": \"把Compose 、MVI新技术合起来， 快速实现 一个玩 Android App\",\n" +
                "                \"type\": 0,\n" +
                "                \"userId\": -1,\n" +
                "                \"visible\": 1,\n" +
                "                \"zan\": 0\n" +
                "            },\n" +
                "            {\n" +
                "                \"apkLink\": \"\",\n" +
                "                \"audit\": 1,\n" +
                "                \"author\": \"谷歌开发者\",\n" +
                "                \"canEdit\": false,\n" +
                "                \"chapterId\": 415,\n" +
                "                \"chapterName\": \"谷歌开发者\",\n" +
                "                \"collect\": false,\n" +
                "                \"courseId\": 13,\n" +
                "                \"desc\": \"\",\n" +
                "                \"descMd\": \"\",\n" +
                "                \"envelopePic\": \"\",\n" +
                "                \"fresh\": false,\n" +
                "                \"host\": \"\",\n" +
                "                \"id\": 22463,\n" +
                "                \"link\": \"https://mp.weixin.qq.com/s/mBbFwuSbVYbXO4lhPV6BpA\",\n" +
                "                \"niceDate\": \"1天前\",\n" +
                "                \"niceShareDate\": \"10小时前\",\n" +
                "                \"origin\": \"\",\n" +
                "                \"prefix\": \"\",\n" +
                "                \"projectLink\": \"\",\n" +
                "                \"publishTime\": 1650211200000,\n" +
                "                \"realSuperChapterId\": 407,\n" +
                "                \"selfVisible\": 0,\n" +
                "                \"shareDate\": 1650294964000,\n" +
                "                \"shareUser\": \"\",\n" +
                "                \"superChapterId\": 408,\n" +
                "                \"superChapterName\": \"公众号\",\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"name\": \"公众号\",\n" +
                "                        \"url\": \"/wxarticle/list/415/1\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"title\": \"如何从提升树 Estimator 迁移到 TensorFlow 决策森林\",\n" +
                "                \"type\": 0,\n" +
                "                \"userId\": -1,\n" +
                "                \"visible\": 1,\n" +
                "                \"zan\": 0\n" +
                "            },\n" +
                "            {\n" +
                "                \"apkLink\": \"\",\n" +
                "                \"audit\": 1,\n" +
                "                \"author\": \"\",\n" +
                "                \"canEdit\": false,\n" +
                "                \"chapterId\": 502,\n" +
                "                \"chapterName\": \"自助\",\n" +
                "                \"collect\": false,\n" +
                "                \"courseId\": 13,\n" +
                "                \"desc\": \"\",\n" +
                "                \"descMd\": \"\",\n" +
                "                \"envelopePic\": \"\",\n" +
                "                \"fresh\": false,\n" +
                "                \"host\": \"\",\n" +
                "                \"id\": 22449,\n" +
                "                \"link\": \"https://www.jianshu.com/p/4d2166ab3390\",\n" +
                "                \"niceDate\": \"1天前\",\n" +
                "                \"niceShareDate\": \"1天前\",\n" +
                "                \"origin\": \"\",\n" +
                "                \"prefix\": \"\",\n" +
                "                \"projectLink\": \"\",\n" +
                "                \"publishTime\": 1650201014000,\n" +
                "                \"realSuperChapterId\": 493,\n" +
                "                \"selfVisible\": 0,\n" +
                "                \"shareDate\": 1650200558000,\n" +
                "                \"shareUser\": \"鸿洋\",\n" +
                "                \"superChapterId\": 494,\n" +
                "                \"superChapterName\": \"广场Tab\",\n" +
                "                \"tags\": [],\n" +
                "                \"title\": \"Android 容易遗漏的刷新小细节\",\n" +
                "                \"type\": 0,\n" +
                "                \"userId\": 2,\n" +
                "                \"visible\": 1,\n" +
                "                \"zan\": 0\n" +
                "            },\n" +
                "            {\n" +
                "                \"apkLink\": \"\",\n" +
                "                \"audit\": 1,\n" +
                "                \"author\": \"\",\n" +
                "                \"canEdit\": false,\n" +
                "                \"chapterId\": 502,\n" +
                "                \"chapterName\": \"自助\",\n" +
                "                \"collect\": false,\n" +
                "                \"courseId\": 13,\n" +
                "                \"desc\": \"\",\n" +
                "                \"descMd\": \"\",\n" +
                "                \"envelopePic\": \"\",\n" +
                "                \"fresh\": false,\n" +
                "                \"host\": \"\",\n" +
                "                \"id\": 22451,\n" +
                "                \"link\": \"https://www.jianshu.com/p/ec1b3295b271\",\n" +
                "                \"niceDate\": \"1天前\",\n" +
                "                \"niceShareDate\": \"1天前\",\n" +
                "                \"origin\": \"\",\n" +
                "                \"prefix\": \"\",\n" +
                "                \"projectLink\": \"\",\n" +
                "                \"publishTime\": 1650201009000,\n" +
                "                \"realSuperChapterId\": 493,\n" +
                "                \"selfVisible\": 0,\n" +
                "                \"shareDate\": 1650200670000,\n" +
                "                \"shareUser\": \"鸿洋\",\n" +
                "                \"superChapterId\": 494,\n" +
                "                \"superChapterName\": \"广场Tab\",\n" +
                "                \"tags\": [],\n" +
                "                \"title\": \"TargetsdkVersion 升级31（Android12）适配\",\n" +
                "                \"type\": 0,\n" +
                "                \"userId\": 2,\n" +
                "                \"visible\": 1,\n" +
                "                \"zan\": 0\n" +
                "            },\n" +
                "            {\n" +
                "                \"apkLink\": \"\",\n" +
                "                \"audit\": 1,\n" +
                "                \"author\": \"\",\n" +
                "                \"canEdit\": false,\n" +
                "                \"chapterId\": 502,\n" +
                "                \"chapterName\": \"自助\",\n" +
                "                \"collect\": false,\n" +
                "                \"courseId\": 13,\n" +
                "                \"desc\": \"\",\n" +
                "                \"descMd\": \"\",\n" +
                "                \"envelopePic\": \"\",\n" +
                "                \"fresh\": false,\n" +
                "                \"host\": \"\",\n" +
                "                \"id\": 22452,\n" +
                "                \"link\": \"https://www.jianshu.com/p/c3e4e1d26e14\",\n" +
                "                \"niceDate\": \"1天前\",\n" +
                "                \"niceShareDate\": \"1天前\",\n" +
                "                \"origin\": \"\",\n" +
                "                \"prefix\": \"\",\n" +
                "                \"projectLink\": \"\",\n" +
                "                \"publishTime\": 1650201007000,\n" +
                "                \"realSuperChapterId\": 493,\n" +
                "                \"selfVisible\": 0,\n" +
                "                \"shareDate\": 1650200682000,\n" +
                "                \"shareUser\": \"鸿洋\",\n" +
                "                \"superChapterId\": 494,\n" +
                "                \"superChapterName\": \"广场Tab\",\n" +
                "                \"tags\": [],\n" +
                "                \"title\": \"Android系统广播(Broadcast)注册，发送，接收流程解析\",\n" +
                "                \"type\": 0,\n" +
                "                \"userId\": 2,\n" +
                "                \"visible\": 1,\n" +
                "                \"zan\": 0\n" +
                "            },\n" +
                "            {\n" +
                "                \"apkLink\": \"\",\n" +
                "                \"audit\": 1,\n" +
                "                \"author\": \"\",\n" +
                "                \"canEdit\": false,\n" +
                "                \"chapterId\": 502,\n" +
                "                \"chapterName\": \"自助\",\n" +
                "                \"collect\": false,\n" +
                "                \"courseId\": 13,\n" +
                "                \"desc\": \"\",\n" +
                "                \"descMd\": \"\",\n" +
                "                \"envelopePic\": \"\",\n" +
                "                \"fresh\": false,\n" +
                "                \"host\": \"\",\n" +
                "                \"id\": 22442,\n" +
                "                \"link\": \"https://juejin.cn/post/7085615364914020365\",\n" +
                "                \"niceDate\": \"1天前\",\n" +
                "                \"niceShareDate\": \"1天前\",\n" +
                "                \"origin\": \"\",\n" +
                "                \"prefix\": \"\",\n" +
                "                \"projectLink\": \"\",\n" +
                "                \"publishTime\": 1650200528000,\n" +
                "                \"realSuperChapterId\": 493,\n" +
                "                \"selfVisible\": 0,\n" +
                "                \"shareDate\": 1650173771000,\n" +
                "                \"shareUser\": \"鸿洋\",\n" +
                "                \"superChapterId\": 494,\n" +
                "                \"superChapterName\": \"广场Tab\",\n" +
                "                \"tags\": [],\n" +
                "                \"title\": \"blog 阶段性总结\",\n" +
                "                \"type\": 0,\n" +
                "                \"userId\": 2,\n" +
                "                \"visible\": 1,\n" +
                "                \"zan\": 0\n" +
                "            },\n" +
                "            {\n" +
                "                \"apkLink\": \"\",\n" +
                "                \"audit\": 1,\n" +
                "                \"author\": \"\",\n" +
                "                \"canEdit\": false,\n" +
                "                \"chapterId\": 502,\n" +
                "                \"chapterName\": \"自助\",\n" +
                "                \"collect\": false,\n" +
                "                \"courseId\": 13,\n" +
                "                \"desc\": \"\",\n" +
                "                \"descMd\": \"\",\n" +
                "                \"envelopePic\": \"\",\n" +
                "                \"fresh\": false,\n" +
                "                \"host\": \"\",\n" +
                "                \"id\": 22445,\n" +
                "                \"link\": \"https://juejin.cn/post/7085934560751386631\",\n" +
                "                \"niceDate\": \"1天前\",\n" +
                "                \"niceShareDate\": \"1天前\",\n" +
                "                \"origin\": \"\",\n" +
                "                \"prefix\": \"\",\n" +
                "                \"projectLink\": \"\",\n" +
                "                \"publishTime\": 1650200524000,\n" +
                "                \"realSuperChapterId\": 493,\n" +
                "                \"selfVisible\": 0,\n" +
                "                \"shareDate\": 1650200438000,\n" +
                "                \"shareUser\": \"鸿洋\",\n" +
                "                \"superChapterId\": 494,\n" +
                "                \"superChapterName\": \"广场Tab\",\n" +
                "                \"tags\": [],\n" +
                "                \"title\": \"Unity 制作的经典打鸭子\",\n" +
                "                \"type\": 0,\n" +
                "                \"userId\": 2,\n" +
                "                \"visible\": 1,\n" +
                "                \"zan\": 0\n" +
                "            },\n" +
                "            {\n" +
                "                \"apkLink\": \"\",\n" +
                "                \"audit\": 1,\n" +
                "                \"author\": \"\",\n" +
                "                \"canEdit\": false,\n" +
                "                \"chapterId\": 502,\n" +
                "                \"chapterName\": \"自助\",\n" +
                "                \"collect\": false,\n" +
                "                \"courseId\": 13,\n" +
                "                \"desc\": \"\",\n" +
                "                \"descMd\": \"\",\n" +
                "                \"envelopePic\": \"\",\n" +
                "                \"fresh\": false,\n" +
                "                \"host\": \"\",\n" +
                "                \"id\": 22444,\n" +
                "                \"link\": \"https://juejin.cn/post/7087375155684442125\",\n" +
                "                \"niceDate\": \"1天前\",\n" +
                "                \"niceShareDate\": \"1天前\",\n" +
                "                \"origin\": \"\",\n" +
                "                \"prefix\": \"\",\n" +
                "                \"projectLink\": \"\",\n" +
                "                \"publishTime\": 1650200522000,\n" +
                "                \"realSuperChapterId\": 493,\n" +
                "                \"selfVisible\": 0,\n" +
                "                \"shareDate\": 1650200433000,\n" +
                "                \"shareUser\": \"鸿洋\",\n" +
                "                \"superChapterId\": 494,\n" +
                "                \"superChapterName\": \"广场Tab\",\n" +
                "                \"tags\": [],\n" +
                "                \"title\": \"关于GC的你应该了解的知识\",\n" +
                "                \"type\": 0,\n" +
                "                \"userId\": 2,\n" +
                "                \"visible\": 1,\n" +
                "                \"zan\": 0\n" +
                "            },\n" +
                "            {\n" +
                "                \"apkLink\": \"\",\n" +
                "                \"audit\": 1,\n" +
                "                \"author\": \"\",\n" +
                "                \"canEdit\": false,\n" +
                "                \"chapterId\": 502,\n" +
                "                \"chapterName\": \"自助\",\n" +
                "                \"collect\": false,\n" +
                "                \"courseId\": 13,\n" +
                "                \"desc\": \"\",\n" +
                "                \"descMd\": \"\",\n" +
                "                \"envelopePic\": \"\",\n" +
                "                \"fresh\": false,\n" +
                "                \"host\": \"\",\n" +
                "                \"id\": 22446,\n" +
                "                \"link\": \"https://juejin.cn/post/7086091435191058463\",\n" +
                "                \"niceDate\": \"1天前\",\n" +
                "                \"niceShareDate\": \"1天前\",\n" +
                "                \"origin\": \"\",\n" +
                "                \"prefix\": \"\",\n" +
                "                \"projectLink\": \"\",\n" +
                "                \"publishTime\": 1650200521000,\n" +
                "                \"realSuperChapterId\": 493,\n" +
                "                \"selfVisible\": 0,\n" +
                "                \"shareDate\": 1650200461000,\n" +
                "                \"shareUser\": \"鸿洋\",\n" +
                "                \"superChapterId\": 494,\n" +
                "                \"superChapterName\": \"广场Tab\",\n" +
                "                \"tags\": [],\n" +
                "                \"title\": \"Google Android MVP示例解读\",\n" +
                "                \"type\": 0,\n" +
                "                \"userId\": 2,\n" +
                "                \"visible\": 1,\n" +
                "                \"zan\": 0\n" +
                "            },\n" +
                "            {\n" +
                "                \"apkLink\": \"\",\n" +
                "                \"audit\": 1,\n" +
                "                \"author\": \"\",\n" +
                "                \"canEdit\": false,\n" +
                "                \"chapterId\": 502,\n" +
                "                \"chapterName\": \"自助\",\n" +
                "                \"collect\": false,\n" +
                "                \"courseId\": 13,\n" +
                "                \"desc\": \"\",\n" +
                "                \"descMd\": \"\",\n" +
                "                \"envelopePic\": \"\",\n" +
                "                \"fresh\": false,\n" +
                "                \"host\": \"\",\n" +
                "                \"id\": 22447,\n" +
                "                \"link\": \"https://juejin.cn/post/7086607125949972487\",\n" +
                "                \"niceDate\": \"1天前\",\n" +
                "                \"niceShareDate\": \"1天前\",\n" +
                "                \"origin\": \"\",\n" +
                "                \"prefix\": \"\",\n" +
                "                \"projectLink\": \"\",\n" +
                "                \"publishTime\": 1650200519000,\n" +
                "                \"realSuperChapterId\": 493,\n" +
                "                \"selfVisible\": 0,\n" +
                "                \"shareDate\": 1650200484000,\n" +
                "                \"shareUser\": \"鸿洋\",\n" +
                "                \"superChapterId\": 494,\n" +
                "                \"superChapterName\": \"广场Tab\",\n" +
                "                \"tags\": [],\n" +
                "                \"title\": \"你需要懂的ViewModel那些事\",\n" +
                "                \"type\": 0,\n" +
                "                \"userId\": 2,\n" +
                "                \"visible\": 1,\n" +
                "                \"zan\": 0\n" +
                "            },\n" +
                "            {\n" +
                "                \"apkLink\": \"\",\n" +
                "                \"audit\": 1,\n" +
                "                \"author\": \"\",\n" +
                "                \"canEdit\": false,\n" +
                "                \"chapterId\": 502,\n" +
                "                \"chapterName\": \"自助\",\n" +
                "                \"collect\": false,\n" +
                "                \"courseId\": 13,\n" +
                "                \"desc\": \"\",\n" +
                "                \"descMd\": \"\",\n" +
                "                \"envelopePic\": \"\",\n" +
                "                \"fresh\": false,\n" +
                "                \"host\": \"\",\n" +
                "                \"id\": 22448,\n" +
                "                \"link\": \"https://juejin.cn/post/7086096930308096014\",\n" +
                "                \"niceDate\": \"1天前\",\n" +
                "                \"niceShareDate\": \"1天前\",\n" +
                "                \"origin\": \"\",\n" +
                "                \"prefix\": \"\",\n" +
                "                \"projectLink\": \"\",\n" +
                "                \"publishTime\": 1650200517000,\n" +
                "                \"realSuperChapterId\": 493,\n" +
                "                \"selfVisible\": 0,\n" +
                "                \"shareDate\": 1650200499000,\n" +
                "                \"shareUser\": \"鸿洋\",\n" +
                "                \"superChapterId\": 494,\n" +
                "                \"superChapterName\": \"广场Tab\",\n" +
                "                \"tags\": [],\n" +
                "                \"title\": \"Android编译解析-Java是如何编译的\",\n" +
                "                \"type\": 0,\n" +
                "                \"userId\": 2,\n" +
                "                \"visible\": 1,\n" +
                "                \"zan\": 0\n" +
                "            },\n" +
                "            {\n" +
                "                \"apkLink\": \"\",\n" +
                "                \"audit\": 1,\n" +
                "                \"author\": \"\",\n" +
                "                \"canEdit\": false,\n" +
                "                \"chapterId\": 502,\n" +
                "                \"chapterName\": \"自助\",\n" +
                "                \"collect\": false,\n" +
                "                \"courseId\": 13,\n" +
                "                \"desc\": \"\",\n" +
                "                \"descMd\": \"\",\n" +
                "                \"envelopePic\": \"\",\n" +
                "                \"fresh\": false,\n" +
                "                \"host\": \"\",\n" +
                "                \"id\": 22431,\n" +
                "                \"link\": \"https://juejin.cn/post/7085747632932388894\",\n" +
                "                \"niceDate\": \"2022-04-15 00:18\",\n" +
                "                \"niceShareDate\": \"2022-04-15 00:17\",\n" +
                "                \"origin\": \"\",\n" +
                "                \"prefix\": \"\",\n" +
                "                \"projectLink\": \"\",\n" +
                "                \"publishTime\": 1649953080000,\n" +
                "                \"realSuperChapterId\": 493,\n" +
                "                \"selfVisible\": 0,\n" +
                "                \"shareDate\": 1649953048000,\n" +
                "                \"shareUser\": \"鸿洋\",\n" +
                "                \"superChapterId\": 494,\n" +
                "                \"superChapterName\": \"广场Tab\",\n" +
                "                \"tags\": [],\n" +
                "                \"title\": \"Class文件 vs Dex文件 你应该知道的东西\",\n" +
                "                \"type\": 0,\n" +
                "                \"userId\": 2,\n" +
                "                \"visible\": 1,\n" +
                "                \"zan\": 0\n" +
                "            },\n" +
                "            {\n" +
                "                \"apkLink\": \"\",\n" +
                "                \"audit\": 1,\n" +
                "                \"author\": \"\",\n" +
                "                \"canEdit\": false,\n" +
                "                \"chapterId\": 502,\n" +
                "                \"chapterName\": \"自助\",\n" +
                "                \"collect\": false,\n" +
                "                \"courseId\": 13,\n" +
                "                \"desc\": \"\",\n" +
                "                \"descMd\": \"\",\n" +
                "                \"envelopePic\": \"\",\n" +
                "                \"fresh\": false,\n" +
                "                \"host\": \"\",\n" +
                "                \"id\": 22430,\n" +
                "                \"link\": \"https://juejin.cn/post/7086361034096803853\",\n" +
                "                \"niceDate\": \"2022-04-15 00:16\",\n" +
                "                \"niceShareDate\": \"2022-04-15 00:16\",\n" +
                "                \"origin\": \"\",\n" +
                "                \"prefix\": \"\",\n" +
                "                \"projectLink\": \"\",\n" +
                "                \"publishTime\": 1649952999000,\n" +
                "                \"realSuperChapterId\": 493,\n" +
                "                \"selfVisible\": 0,\n" +
                "                \"shareDate\": 1649952994000,\n" +
                "                \"shareUser\": \"鸿洋\",\n" +
                "                \"superChapterId\": 494,\n" +
                "                \"superChapterName\": \"广场Tab\",\n" +
                "                \"tags\": [],\n" +
                "                \"title\": \"Android安卓进阶技术分享之AGP工作原理\",\n" +
                "                \"type\": 0,\n" +
                "                \"userId\": 2,\n" +
                "                \"visible\": 1,\n" +
                "                \"zan\": 0\n" +
                "            },\n" +
                "            {\n" +
                "                \"apkLink\": \"\",\n" +
                "                \"audit\": 1,\n" +
                "                \"author\": \"鸿洋\",\n" +
                "                \"canEdit\": false,\n" +
                "                \"chapterId\": 408,\n" +
                "                \"chapterName\": \"鸿洋\",\n" +
                "                \"collect\": false,\n" +
                "                \"courseId\": 13,\n" +
                "                \"desc\": \"\",\n" +
                "                \"descMd\": \"\",\n" +
                "                \"envelopePic\": \"\",\n" +
                "                \"fresh\": false,\n" +
                "                \"host\": \"\",\n" +
                "                \"id\": 22453,\n" +
                "                \"link\": \"https://mp.weixin.qq.com/s/UBRnCuRI7WAdnga60-G_CQ\",\n" +
                "                \"niceDate\": \"2022-04-15 00:00\",\n" +
                "                \"niceShareDate\": \"1天前\",\n" +
                "                \"origin\": \"\",\n" +
                "                \"prefix\": \"\",\n" +
                "                \"projectLink\": \"\",\n" +
                "                \"publishTime\": 1649952000000,\n" +
                "                \"realSuperChapterId\": 407,\n" +
                "                \"selfVisible\": 0,\n" +
                "                \"shareDate\": 1650203163000,\n" +
                "                \"shareUser\": \"\",\n" +
                "                \"superChapterId\": 408,\n" +
                "                \"superChapterName\": \"公众号\",\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"name\": \"公众号\",\n" +
                "                        \"url\": \"/wxarticle/list/408/1\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"title\": \"DataBinding+LiveData轻松实现无重启换肤\",\n" +
                "                \"type\": 0,\n" +
                "                \"userId\": -1,\n" +
                "                \"visible\": 1,\n" +
                "                \"zan\": 0\n" +
                "            },\n" +
                "            {\n" +
                "                \"apkLink\": \"\",\n" +
                "                \"audit\": 1,\n" +
                "                \"author\": \"郭霖\",\n" +
                "                \"canEdit\": false,\n" +
                "                \"chapterId\": 409,\n" +
                "                \"chapterName\": \"郭霖\",\n" +
                "                \"collect\": false,\n" +
                "                \"courseId\": 13,\n" +
                "                \"desc\": \"\",\n" +
                "                \"descMd\": \"\",\n" +
                "                \"envelopePic\": \"\",\n" +
                "                \"fresh\": false,\n" +
                "                \"host\": \"\",\n" +
                "                \"id\": 22454,\n" +
                "                \"link\": \"https://mp.weixin.qq.com/s/HEMUkjIpPaRGg7C9CmfQNw\",\n" +
                "                \"niceDate\": \"2022-04-15 00:00\",\n" +
                "                \"niceShareDate\": \"1天前\",\n" +
                "                \"origin\": \"\",\n" +
                "                \"prefix\": \"\",\n" +
                "                \"projectLink\": \"\",\n" +
                "                \"publishTime\": 1649952000000,\n" +
                "                \"realSuperChapterId\": 407,\n" +
                "                \"selfVisible\": 0,\n" +
                "                \"shareDate\": 1650203190000,\n" +
                "                \"shareUser\": \"\",\n" +
                "                \"superChapterId\": 408,\n" +
                "                \"superChapterName\": \"公众号\",\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"name\": \"公众号\",\n" +
                "                        \"url\": \"/wxarticle/list/409/1\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"title\": \"更多 ViewBinding 的封装思路\",\n" +
                "                \"type\": 0,\n" +
                "                \"userId\": -1,\n" +
                "                \"visible\": 1,\n" +
                "                \"zan\": 0\n" +
                "            },\n" +
                "            {\n" +
                "                \"apkLink\": \"\",\n" +
                "                \"audit\": 1,\n" +
                "                \"author\": \"鸿洋\",\n" +
                "                \"canEdit\": false,\n" +
                "                \"chapterId\": 408,\n" +
                "                \"chapterName\": \"鸿洋\",\n" +
                "                \"collect\": false,\n" +
                "                \"courseId\": 13,\n" +
                "                \"desc\": \"\",\n" +
                "                \"descMd\": \"\",\n" +
                "                \"envelopePic\": \"\",\n" +
                "                \"fresh\": false,\n" +
                "                \"host\": \"\",\n" +
                "                \"id\": 22427,\n" +
                "                \"link\": \"https://mp.weixin.qq.com/s/L572_c2xTssoiFd9ypsN5w\",\n" +
                "                \"niceDate\": \"2022-04-14 00:00\",\n" +
                "                \"niceShareDate\": \"2022-04-14 22:22\",\n" +
                "                \"origin\": \"\",\n" +
                "                \"prefix\": \"\",\n" +
                "                \"projectLink\": \"\",\n" +
                "                \"publishTime\": 1649865600000,\n" +
                "                \"realSuperChapterId\": 407,\n" +
                "                \"selfVisible\": 0,\n" +
                "                \"shareDate\": 1649946151000,\n" +
                "                \"shareUser\": \"\",\n" +
                "                \"superChapterId\": 408,\n" +
                "                \"superChapterName\": \"公众号\",\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"name\": \"公众号\",\n" +
                "                        \"url\": \"/wxarticle/list/408/1\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"title\": \"Android 13种 Drawable，全面掌握！\",\n" +
                "                \"type\": 0,\n" +
                "                \"userId\": -1,\n" +
                "                \"visible\": 1,\n" +
                "                \"zan\": 0\n" +
                "            },\n" +
                "            {\n" +
                "                \"apkLink\": \"\",\n" +
                "                \"audit\": 1,\n" +
                "                \"author\": \"郭霖\",\n" +
                "                \"canEdit\": false,\n" +
                "                \"chapterId\": 409,\n" +
                "                \"chapterName\": \"郭霖\",\n" +
                "                \"collect\": false,\n" +
                "                \"courseId\": 13,\n" +
                "                \"desc\": \"\",\n" +
                "                \"descMd\": \"\",\n" +
                "                \"envelopePic\": \"\",\n" +
                "                \"fresh\": false,\n" +
                "                \"host\": \"\",\n" +
                "                \"id\": 22428,\n" +
                "                \"link\": \"https://mp.weixin.qq.com/s/t9HgXjihKewU0t198NF9yg\",\n" +
                "                \"niceDate\": \"2022-04-14 00:00\",\n" +
                "                \"niceShareDate\": \"2022-04-14 22:22\",\n" +
                "                \"origin\": \"\",\n" +
                "                \"prefix\": \"\",\n" +
                "                \"projectLink\": \"\",\n" +
                "                \"publishTime\": 1649865600000,\n" +
                "                \"realSuperChapterId\": 407,\n" +
                "                \"selfVisible\": 0,\n" +
                "                \"shareDate\": 1649946165000,\n" +
                "                \"shareUser\": \"\",\n" +
                "                \"superChapterId\": 408,\n" +
                "                \"superChapterName\": \"公众号\",\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"name\": \"公众号\",\n" +
                "                        \"url\": \"/wxarticle/list/409/1\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"title\": \"Android IM 开发之旅\",\n" +
                "                \"type\": 0,\n" +
                "                \"userId\": -1,\n" +
                "                \"visible\": 1,\n" +
                "                \"zan\": 0\n" +
                "            },\n" +
                "            {\n" +
                "                \"apkLink\": \"\",\n" +
                "                \"audit\": 1,\n" +
                "                \"author\": \"TxcA\",\n" +
                "                \"canEdit\": false,\n" +
                "                \"chapterId\": 539,\n" +
                "                \"chapterName\": \"未分类\",\n" +
                "                \"collect\": false,\n" +
                "                \"courseId\": 13,\n" +
                "                \"desc\": \":confetti_ball: Android Spannable 扩展，简单易用，支持Kotlin\\\\Java。\",\n" +
                "                \"descMd\": \"\",\n" +
                "                \"envelopePic\": \"https://www.wanandroid.com/blogimgs/f66d7fb0-aa7f-4282-b1a2-3ba53e3c5dac.png\",\n" +
                "                \"fresh\": false,\n" +
                "                \"host\": \"\",\n" +
                "                \"id\": 22419,\n" +
                "                \"link\": \"https://www.wanandroid.com/blog/show/3355\",\n" +
                "                \"niceDate\": \"2022-04-13 22:57\",\n" +
                "                \"niceShareDate\": \"2022-04-13 22:57\",\n" +
                "                \"origin\": \"\",\n" +
                "                \"prefix\": \"\",\n" +
                "                \"projectLink\": \"https://github.com/TxcA/SpannableX\",\n" +
                "                \"publishTime\": 1649861827000,\n" +
                "                \"realSuperChapterId\": 293,\n" +
                "                \"selfVisible\": 0,\n" +
                "                \"shareDate\": 1649861827000,\n" +
                "                \"shareUser\": \"\",\n" +
                "                \"superChapterId\": 294,\n" +
                "                \"superChapterName\": \"开源项目主Tab\",\n" +
                "                \"tags\": [\n" +
                "                    {\n" +
                "                        \"name\": \"项目\",\n" +
                "                        \"url\": \"/project/list/1?cid=539\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"title\": \"SpannableX\",\n" +
                "                \"type\": 0,\n" +
                "                \"userId\": -1,\n" +
                "                \"visible\": 1,\n" +
                "                \"zan\": 0\n" +
                "            }\n" +
                "        ]";
        return data;
    }
}
