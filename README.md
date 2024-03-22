# PermissionPurge

## Introduction
`PermissionPurge` is a Minecraft plugin designed to streamline the management of permissions for server administrators. This plugin allows for efficient purging of unused or outdated permissions, helping maintain a clean and organized permission setup.

## Features
- Bulk removal of unused permissions.
- Easy-to-use commands for quick permission management.
- Compatibility with the popular permission manager [LuckPerms](https://luckperms.net/).

## Prerequisites
Before installing `PermissionPurge`, ensure you have:
- A Minecraft server running a Bukkit based Server, [Paper](https://papermc.io/) Recommended. 
- LuckPerms installed and configured.

## Installation
1. Download the latest version of `PermissionPurge` from [Modrinth](https://modrinth.com/project/permissionpurge) (Pending Review)
2. Place the downloaded `.jar` file into your server's `plugins` directory.
3. Restart your server to load the plugin.

## Usage
After installing the plugin, use the following commands in-game or from the server console:
- `/pp user <user> <permission>` - Purges a permission set from a specific user, starting with your <permission>.
- `/pp group <luckperms group> <permission>` - Purges a permission set from a LuckPerms group, starting with your <permission>

## Configuration
`PermissionPurge` requires no configuration. the only permission provided is `permissionpurge.purge`. this gives access to all commands and arguments. 

## Support
If you encounter any issues or have suggestions for improvements, please file an issue on the [GitHub Issues page](https://github.com/Evidentsinger14/PermissionPurge/issues).

## Contributing
Contributions to `PermissionPurge` are welcome! If you would like to contribute, please fork the repository and submit a pull request with your changes.
