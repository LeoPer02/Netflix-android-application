# Netflix-like Android Application

## Overview

This project comprises three main components:

1. **User Application:** Enables users to watch streams.
2. **CMS Application:** Allows administrators to upload and delete movies, and manage user settings.
3. **Application Server:** Responsible for storing, streaming, and processing movies/streams.

## Motivation

This project was developed as an assignment for a Mobile Programming class. The goal was to create an Android application similar to Netflix, with the added functionality for users to upload their own movies and stream them using NGINX. The project is divided into three parts as outlined above, all developed by our group.

## About the Server

The server is built using Jetty and Jersey, with Maven as the build tool. It is designed to run on Google Cloud but can be adapted to other environments. The server handles several key tasks:

- **Storage:** Movies are stored both locally on the server and in a Google Cloud bucket to ensure availability even if NGINX is down.
- **Thumbnails:** Automatically generates thumbnails for movies if none are provided.
- **Streaming:** Streams movies using NGINX and creates a 360p version for users with weaker network connections.

MariaDB is used to store information, with JDBC and Prepared Statements facilitating the connection between the server and the database. Note that movies are not saved directly in the database; only the paths to their storage locations are saved.

> **Note:** Movies are not stored directly in the database. Instead, the database stores the path to the folder where movies are kept.

Developed by Jaime Ferreira, Leandro Pereira, Ricardo Costa

## License

This project is licensed under the MIT License. See the [LICENSE](./LICENSE) file for details.

### Trademark Disclaimer

This project is for educational purposes only and is not affiliated with, endorsed by, or associated with Netflix, Inc. All trademarks, logos, and brand names are the property of their respective owners.

