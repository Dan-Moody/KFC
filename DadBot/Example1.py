# bot.py
import os

import discord
from dotenv import load_dotenv

load_dotenv()
TOKEN = os.getenv('DISCORD_TOKEN')
GUILD = os.getenv('DISCORD_GUILD')

# Object that represents a connection to Discord
# Clients handle events, track state, and intereact with Discord API
client = discord.Client()

# Handles the event when the Client has established a connection to Discord
# And it has finished preparing the data that Discord has sent
# Such as login state, guild and channel data, and more
@client.event
async def on_ready():
    # Iterates through list of connected Guilds until it finds the correct one    
    # for guild in client.guilds:
    #     if guild.name == GUILD: # Checks is the current guild matches the one in .env
    #         break
    guild = discord.utils.get(client.guilds, name=GUILD)

    print(
        f'{client.user} is connected to the following guild:\n'
        f'{guild.name}(id: {guild.id})'
    )

    # Get and join list of use names idk why this isn't working
    members = '\n - '.join([member.name for member in guild.members])
    print(f'Guild Members:\n - {members}')

# runs the client
client.run(TOKEN)