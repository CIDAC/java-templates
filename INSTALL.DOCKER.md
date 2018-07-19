# Downloading and Installing Docker on Linux

This section describes, in 6 steps, the procedure to download and install docker.

## Downloading the docker installation script

In your browser, open this [link](https://get.docker.com/) and inside the webpage, look for the line bellow, then copy and paste on terminal:

```sh
curl -fsSL get.docker.com -o get-docker.sh
```

Also look for the line bellow and copy and paste on terminal:

```sh
sh get-docker.sh
```

## Add your user to the "docker" group type

To add your user to the "docker" group type, open the terminal and add the command below. Reboot your operating system after execute this command to be sure that it’s will work as expected.

```sh
sudo usermod -aG docker $USER
```

## Test if docker is running correctly

To test if docker is running correctly type in terminal the following commands and you should see the Client and Server version:

```sh
sudo docker version
docker version
```

## Installing Docker Machine

To install docker-machine go to [https://github.com/docker/machine/releases](https://github.com/docker/machine/releases), find the Linux command and execute it in the terminal.

You can also find the same instructions at [https://docs.docker.com/machine/install-machine/](https://docs.docker.com/machine/install-machine/).

To test if Docker Machine has been installed type this command in terminal:

```sh
docker-machine version
```

## Installing Docker Compose

To install docker-compose go to [https://github.com/docker/compose/releases](https://github.com/docker/compose/releases), find the Linux command and execute it in the terminal.

You can also find the same instructions at [https://docs.docker.com/compose/install/](https://docs.docker.com/compose/install/).

To test if Docker Compose has been installed type this command in terminal:

```sh
docker-compose version
```

## Configuring proxy

If you are behind a HTTP or HTTPS proxy server follow this link: [https://docs.docker.com/engine/admin/systemd/#httphttps-proxy](https://docs.docker.com/engine/admin/systemd/#httphttps-proxy)
