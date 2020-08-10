# 服务B
为服务A提供服务

## 前提
- 安装Git
- 安装maven
- 安装docker
- 安装k8s集群
- 安装istio

## 打包
```
mvn clean package
```

## 构建镜像
```
cd service-b/
docker build -t kyg/service-b-docker .
```

## 查看镜像
```
docker images kyg/service-b-docker
```

## 部署
```
kubectl apply -f service-b.yaml
```

## 入口网关
```
kubectl apply -f service-b-gateway.yaml
kubectl patch svc service-b -p '{"spec": {"type": "LoadBalancer"}}'
```

## 访问
```
curl -d "username=admin&password=admin" http://localhost:8092/checkUser
```