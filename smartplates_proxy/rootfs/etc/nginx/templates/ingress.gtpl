server {
    listen 6000 default_server;

    include /etc/nginx/includes/server_params.conf;

    location / {
        allow   172.30.32.12;
        deny    all;

        proxy_pass http://backend;
        proxy_set_header X-Ingress-Path {{ .entry }};
        include /etc/nginx/includes/proxy_params.conf;
    }
}