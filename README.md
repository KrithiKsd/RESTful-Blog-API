# spring-boot-blog

This is a simple Spring Boot blog application that demonstrates basic CRUD (Create, Read, Update, Delete) operations for blog posts. It uses Spring Data JPA for data persistence and PostgreSQL as the database. Docker is used for containerization, and Postman is used for testing the API endpoints.

API Endpoints

The following API endpoints are available:

    GET /api/v1/blogs/: Get a list of all blog posts.
    GET /api/v1/blogs/{id}: Get a blog post by ID.
    POST /api/v1/blogs/: Create a new blog post.
    PUT api/v1/blogs/{id}: Update an existing blog post.
    DELETE api/v1/blogs/{id}: Delete a blog post by ID.
    
