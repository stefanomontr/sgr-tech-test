FROM node:20.17.0-alpine

ENV SGR_BACKEND_API=http://sgr-backend

WORKDIR /app

COPY package.json .

RUN npm install

COPY . .

EXPOSE 3000

VOLUME ["/app/node_modules"]

CMD ["npm", "run", "dev"]