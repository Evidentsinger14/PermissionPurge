# Permission Purge

`PermissionPurge` is a Minecraft plugin designed to streamline the management of permissions for server administrators. This plugin allows for efficient purging of unused or outdated permissions, helping maintain a clean and organized permission setup.


<details> 
 <summary><strong>Features</strong></summary>

- Bulk removal of unused permissions.

- Easy-to-use commands for quick permission management.

- Compatibility with the popular permission manager [LuckPerms](https://luckperms.net/).
</details>

<details> 
 <summary><strong>Prerequisites</strong></summary>

Before installing `PermissionPurge`, ensure you have:
- A Minecraft server running a Bukkit based Server, [Paper](https://papermc.io/) Recommended.
- LuckPerms installed and configured.
</details>

<details> 
 <summary><strong>Installation</strong></summary>

1. Download the latest version of `PermissionPurge` from one of the sources listed [below](https://github.com/Evidentsinger14/PermissionPurge#downloads)
2. Place the downloaded `.jar` file into your server's `plugins` directory.
3. Restart your server to load the plugin.
</details>

## Usage
After installing the plugin, use the following commands in-game or from the server console:
- `/pp user <user> <permission>` - Purges a permission set from a specific user, starting with your <permission>.
- `/pp group <luckperms group> <permission>` - Purges a permission set from a LuckPerms group, starting with your <permission>

## Configuration
`PermissionPurge` requires no configuration. the only permission provided is `permissionpurge.purge`. this gives access to all commands and arguments. 

## Support
If you encounter any issues or have suggestions for improvements, please file an issue on the [GitHub Issues page](https://github.com/Evidentsinger14/PermissionPurge/issues).

## Downloads
| Platform | Link                                                                             | Badges                                                                                                                |
|----------|----------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------|
| Modrinth | [Download Link](https://modrinth.com/plugin/permissionpurge/) (Pending Approval) | ![Modrinth Downloads](https://img.shields.io/modrinth/dt/permissionpurge)                                             |
| Jenkins  | [Download Link](https://ci.ev1dent.dev/job/MetaTokens/)                          | [![Build Status](https://ci.ev1dent.dev/job/PermissionPurge/badge/icon)](https://ci.ev1dent.dev/job/PermissionPurge/) |

## Contributing
Contributions to `PermissionPurge` are welcome! If you would like to contribute, please fork the repository and submit a pull request with your changes.
