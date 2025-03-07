package com.example.distributedsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return """
            <!DOCTYPE html>
            <html>
            <head>
                <title>Distributed System</title>
                <meta charset="UTF-8">
                <style>
                    body { 
                        font-family: Arial, sans-serif; 
                        margin: 40px; 
                        background-color: #f5f5f5;
                    }
                    .container {
                        max-width: 800px;
                        margin: 0 auto;
                        background-color: white;
                        padding: 20px;
                        border-radius: 8px;
                        box-shadow: 0 2px 4px rgba(0,0,0,0.1);
                    }
                    h1 { 
                        color: #2c3e50; 
                        text-align: center;
                    }
                    .endpoints { 
                        margin: 20px 0;
                    }
                    .endpoint { 
                        margin: 15px 0;
                        padding: 10px;
                        background-color: #f8f9fa;
                        border-radius: 4px;
                    }
                    a {
                        color: #3498db;
                        text-decoration: none;
                    }
                    a:hover {
                        text-decoration: underline;
                    }
                </style>
            </head>
            <body>
                <div class="container">
                    <h1>Distributed System</h1>
                    <div class="endpoints">
                        <div class="endpoint">📊 <a href="/actuator/health">System Health</a></div>
                        <div class="endpoint">👥 <a href="/api/users">Users API</a></div>
                        <div class="endpoint">ℹ️ <a href="/actuator/info">System Info</a></div>
                        <div class="endpoint">📚 <a href="/api">API Documentation</a></div>
                    </div>
                </div>
            </body>
            </html>
            """;
    }

    @GetMapping("/api")
    @ResponseBody
    public String api() {
        return """
            <!DOCTYPE html>
            <html>
            <head>
                <title>API Documentation</title>
                <meta charset="UTF-8">
                <style>
                    body { 
                        font-family: Arial, sans-serif; 
                        margin: 40px; 
                        background-color: #f5f5f5;
                    }
                    .container {
                        max-width: 800px;
                        margin: 0 auto;
                        background-color: white;
                        padding: 20px;
                        border-radius: 8px;
                        box-shadow: 0 2px 4px rgba(0,0,0,0.1);
                    }
                    h1 { 
                        color: #2c3e50; 
                        text-align: center;
                    }
                    .endpoint { 
                        margin: 15px 0;
                        padding: 10px;
                        background-color: #f8f9fa;
                        border-radius: 4px;
                    }
                    .method {
                        font-weight: bold;
                        color: #e67e22;
                    }
                </style>
            </head>
            <body>
                <div class="container">
                    <h1>API Documentation</h1>
                    <div class="endpoint"><span class="method">GET</span> /api/users - List all users</div>
                    <div class="endpoint"><span class="method">GET</span> /api/users/{id} - Get user by ID</div>
                    <div class="endpoint"><span class="method">POST</span> /api/users - Create new user</div>
                    <div class="endpoint"><a href="/">← Back to Home</a></div>
                </div>
            </body>
            </html>
            """;
    }
} 