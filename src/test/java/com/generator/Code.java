package com.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;

//代码自动生成器
public class Code {


     public static void main(String[] args) {

         // 需要构建一个 代码自动生成器 对象
         AutoGenerator mpg = new AutoGenerator();

         // 配置策略

         // 1、全局配置
         GlobalConfig gc = new GlobalConfig();

         //获取当前的项目路径
         String projectPath = System.getProperty("user.dir");
         gc.setOutputDir(projectPath+"/src/main/java");
         //设置项目作者
         gc.setAuthor("张祺 1261553384@qq.com");
         //项目创建完是否打开项目所处的文件夹
         gc.setOpen(false);
         // 是否覆盖
         gc.setFileOverride(false);
         // 去Service的I前缀
         gc.setServiceName("%sService");
         //设置主键生成策略
         gc.setIdType(IdType.AUTO);
         //设置日期类型
         gc.setDateType(DateType.ONLY_DATE);
         //是否生成Swagger文档
         gc.setSwagger2(true);
         //把这些设置放入全局配置里面去
         mpg.setGlobalConfig(gc);


         //2、设置数据源
         DataSourceConfig dsc = new DataSourceConfig();
         dsc.setUrl("jdbc:mysql://localhost:3306/leyou?useUnicode=true" +
                 "&characterEncoding=UTF-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Asia/Shanghai");
         //com.mysql.cj.jdbc.Driver 8版本
         dsc.setDriverName("com.mysql.jdbc.Driver");
         dsc.setUsername("root");
         dsc.setPassword("1234");
         dsc.setDbType(DbType.MYSQL);
         mpg.setDataSource(dsc);

         //3、包的配置
         PackageConfig pc = new PackageConfig();
         //设置模块名字
         pc.setModuleName("blog");
         //设置所处的父类包名
         pc.setParent("com.generator");
         //实体类
         pc.setEntity("entity");
         //mapper接口
         pc.setMapper("mapper");
         //控制层
         pc.setController("controller");
         mpg.setPackageInfo(pc);


         //4、策略配置
         StrategyConfig strategy = new StrategyConfig();

         //  设置要映射的表名
//         strategy.setInclude("blog_tags","course"
//                 ,"links","sys_settings","user_record"," user_say");



         //表名驼峰
         strategy.setNaming(NamingStrategy.underline_to_camel);
         //列名驼峰
         strategy.setColumnNaming(NamingStrategy.underline_to_camel);
         // 自动生成lombok；
         strategy.setEntityLombokModel(true);


        //设置逻辑删除的字段
         //strategy.setLogicDeleteFieldName("deleted");



         // //自动填充字段,在项目开发过程中,例如创建时间，修改时间,每次，都需要我们来指定，太麻烦了,设置为自动填充规则，就不需要我们赋值咯

         TableFill gmtCreate = new TableFill("create_time", FieldFill.INSERT);

         TableFill gmtModified = new TableFill("last_update_time", FieldFill.INSERT_UPDATE);

         ArrayList<TableFill> tableFills = new ArrayList<>();
         tableFills.add(gmtCreate);
         tableFills.add(gmtModified);
         strategy.setTableFillList(tableFills);


         // 乐观锁
         //strategy.setVersionFieldName("version");

         //开始Controler驼峰命名格式
         strategy.setRestControllerStyle(true);
         // localhost:8080/hello_id_2
         strategy.setControllerMappingHyphenStyle(true);
         mpg.setStrategy(strategy);
         //执行
         mpg.execute();


     }


}
