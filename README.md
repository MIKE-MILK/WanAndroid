# 第五周合作开发项目

所谓合作开发，是指多个人同时负责一个大的工程，但是每个人负责的是一些细分的小模块。通过Git来同步工作进度。

## 任务要求

* 干货集中营App
  * api：https://gank.io/api
* 使用合作开发，每个人至少负责一个功能，自由分工，每个文件需要自己署名，署名方法就是添加文件头（我上课的时候讲过的那个
* 工作内容进度提交至此Github仓库，且至少每个人有4次commit记录，并符合commit规范，详情见Git操作指南和commit规范
* 严格按照分包规范存放文件，详情见分包含义
* 严格按照命名规范、String、color等数值存放规范
* 有任何问题直接在大群处提问，避免私聊导致不能得到很好的解决
* 截止时间**4月4日周六晚**，时间充裕，相信大家在实战阶段可以学到更多的东西，中间还有一个节课，讲的是架构，或许可以加深你们对这个框架的理解。
* 我也不是什么魔鬼，有什么困难问就可以了，既然是合作开发项目，那少不了成员之间的沟通，如果觉得有我的群不太好说话，就自己建一个吧🤣

## 项目需求

### 页面需求

仅供参考，你们也可以自己设计界面内容

* 首页toolsbar提供搜索、轮播图、提供随机的数据
* 有一个热榜页（要求三种类型各展示5个，并分类在同一页面中），还可以提供所有的分类
* 提供一个页面，专门展示某个category-type的信息、包括其评论
* ......其他
* 建议采用Material Design的设计，减少大家设计页面的成本



### 功能需求

* App兼容Api 21以上

* 需要实现干货集中营API v2文档中的全部接口功能

* 使用MVP架构，具体架构我并未实现，我不想拘束大家的思想，大家集思广益来拟一个架构出来，

* 有数据持久层，即数据库，图片缓存不做强制性要求

## Git操作指南

本次不仅仅是锻炼业务能力，还有就是Git合作开发的实战。

* 这个项目分为三大分支，master分支、dev分支、p分支（个人分支）
* master分支为版本迭代分支（即主分支），应尽量少的进行commit，每一次commit意味着具有重大更新内容。
* dev分支为开发分支，由master分支分来，为开发阶段用于更新开发进度的分支。
* p分支为个人分支，由dev分支分来，命名规范为：p/你的id，如p/huanglong。
* 要求每个人拥有一个独立的分支，在自己的个人分支下，当完成一个自己的任务点时，进行一次commit，完成一个较大的任务点时，向dev分支merge（合并），当dev分支收集到了一个版本迭代所需要的所有任务点，并通过测试后，向master分支merge（合并）。至此完成一次版本迭代工作。



## commit规范

为了保证commit条目的清晰，采用以下方式进行commit

```
git add .
git commit -s//进入commit记录编辑界面

//以下为commit记录内容
[type]commit题目
commit内容

//签名（已自带
Signed-off-by: Override <854098072@qq.com>
```

* type

  指本次commit改动所属类型

  * Bugfix: bug修复
  * Feature：需求
  * Optimize：优化
  * Release：版本迭代
  * Update：依赖&架构升级

* commit题目

  对于本次commit的一个简单描述

  e.g：MVP架构的修改

* commit内容

  对于本次commit内容的具体描述

  e.g：

  1. 在BaseActivity中添加了XXXX方法，用于XXXXX

  2. 修改了BaseFragment的XXXXX，避免造成XXXXX

* 🌰：

  [Update] MVP架构的修改

  1. 在BaseActivity中添加了XXXX方法，用于XXXXX

  2. 修改了BaseFragment的XXXXX，避免造成XXXXX

## 分包含义

一些简单的就不再解释

* base：存放base类
* bean：存放JavaBean（即只有settergetter的纯数据模型类）

* database：存放数据库相关的类
* model：MVP中的model层
* network：存放与网络请求相关的类
* presenter：MVP中的presenter层
* repository：位于MVP中M层与P层的中间调度类，负责调度数据从network获取还是database获取
* utils：存放一些工具类
* view：MVP中的View层
  * activity
  * adapter
  * fragment
  * widget：自定义View或者小控件
* ......如有需求，可以自行添加包