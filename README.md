# kubernetes-spring-boot

Build the docker images

```
docker build . -t kubernetes-spring-boot:v1
```

List the images

```
docker images
```

Run the docker images

```
docker run -dp 8080:8080 kubernetes-spring-boot:v1
```

