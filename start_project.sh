#!/bin/bash

# Mostrar mensaje inicial
echo "Iniciando la configuración del proyecto..."

# 1. Verificar si Docker está instalado
if ! [ -x "$(command -v docker)" ]; then
  echo "Error: Docker no está instalado." >&2
  exit 1
fi

# 2. Verificar si Docker Compose está instalado
if ! [ -x "$(command -v docker-compose)" ]; then
  echo "Error: Docker Compose no está instalado." >&2
  exit 1
fi

# 3. Construir la imagen del backend
echo "Construyendo la imagen del backend..."
if ! docker build -t bsn/bsn:1.0.0 -f ./docker/backend/Dockerfile ./book-network; then
  echo "Error: Falló la construcción de la imagen del backend." >&2
  exit 1
fi

# 4. Construir la imagen del frontend
echo "Construyendo la imagen del frontend..."
if ! docker build -t bsn/bsn-ui:1.0.0 -f ./docker/frontend/Dockerfile ./book-network-ui; then
  echo "Error: Falló la construcción de la imagen del frontend." >&2
  exit 1
fi

# 5. Levantar los contenedores con Docker Compose
echo "Levantando los contenedores..."
if ! docker-compose -f ./docker/docker-compose.yml up -d; then
  echo "Error: Falló al levantar los contenedores con Docker Compose." >&2
  exit 1
fi

# 6. Mostrar mensaje final
echo "El proyecto ha sido levantado correctamente."
echo "Puedes acceder al backend en http://localhost:8088"
echo "Puedes acceder al frontend en http://localhost:8080"
echo "Puedes acceder a MailDev en http://localhost:1080"
echo "Puedes acceder a Keycloak en http://localhost:9090"

# 7. Verificar el estado de los contenedores
docker ps

# 8. Mostrar logs de Docker Compose
echo "Mostrando los logs de los contenedores..."
docker-compose -f ./docker/docker-compose.yml logs -f
