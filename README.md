# springboot-hello-world

A simple helloworld microservice developed using SpringBoot

<pre>
Here are the supported resources to access the helloworld service :
  http://HOST:PORT/
  http://HOST:PORT/hello
  http://HOST:PORT/hello/{message}
</pre>


构建docker镜像

```
$ docker build -t springboot-hello-world .
```

运行docker镜像

```
$ docker run -it -p 8084:8084 springboot-hello-world
```

