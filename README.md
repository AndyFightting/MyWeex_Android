# MyWeex_Android

####如何运行

1. 下载后把 js/host.js 和 MainActivity.java 文件里的 ip 地址改成你电脑的地址。
2. 进入 `MyWeex_Android/js` 文件夹，把里面的`weex_tmp.zip`解压出一份放那里。(里面放置了图片文件，因为每次服务关闭后这个文件夹会被自动删除，所以压缩着预留一份，以后要运行的话就按这套路走一波就可以了)
3. cd 进入 js 文件夹执行命令 `weex ./ -o ./weex_tmp/h5_render/` (这个命令会把we文件转为js文件放在h5_render文件夹里)
4. 然后再执行命令 `weex ./ -o ./weex_tmp/h5_render/ --watch` (因为这个命令一开始不会把we文件转为js，所以用上面命令先转一下之后再监听文件夹里的we文件)
5. 新建一个命令窗口进入js文件夹，执行命令 `weex -s ./` 开启服务
6. Android Studio 打开MyWeex_Android就可以模拟器或者真机运行了。对we文件修改后会自动转为js文件，再运行就能看到效果了。

####小米截屏
![](https://github.com/AndyFightting/MyWeex_Android/blob/master/image.png)

 Weex 真是大大提高了开发效率，但还有很多需要完善的地方。比如 [list 没法分组悬浮](https://github.com/alibaba/weex/issues/2032), [Android push 还是会有ActionBar](https://github.com/alibaba/weex/issues/2026)等问题，不过相信它会越来越好的。
