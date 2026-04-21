📦 CLI File Bundler
A powerful .NET-based Command Line Interface (CLI) tool designed to streamline the process of bundling, filtering, and organizing source code files into a single, structured output.

🌟 Key Features
Selective Bundling: Filter files by specific extensions (e.g., .cs, .js, .py).
Source Tracking: Automatically injects comments with the original file path above each code block.
Smart Sorting: Organize files within the bundle by name or by file type.
Code Optimization: Optional removal of empty lines to reduce bundle size.
Response File (RSP) Support: Create and use .rsp files to store complex command configurations for quick execution.
🛠 Tech Stack
Language: C# 12 / .NET 8
Core Logic: System.IO (File Stream Management)
CLI Infrastructure: System.CommandLine (or custom argument parsing)
🚀 Usage
Simple Bundle Command:
bundle --output "final_project.txt" --language "cs,html" --sort "type" --note
