# bot.py
import os

import discord
import random
import time
from DadJokes import dadJokes
import re #regular expression library
from dotenv import load_dotenv

load_dotenv()
TOKEN = os.getenv('DISCORD_TOKEN')

client = discord.Client()

# When the bot connects print the username of the bot
@client.event
async def on_ready():
    print(f'{client.user.name} has connected to Discord!')

# Handles event that a new member joined
@client.event
async def on_member_join(member):
    await member.create_dm()
    await member.dm_channel.send(
        f'Hi {member.name}, welcome to my Discord server!'
    )

@client.event
async def on_message(message):
    # Checks if the message was sent by itself
    if message.author == client.user:
        return

    if 'i\'m' in message.content.lower() or 'im' in message.content.lower() or 'i am' in message.content.lower():
        dadName = re.split(' im | i\'m |im |i\'m |i am | i am |', message.content.lower(), 1)[1]
        print(message.content)
        response = f'Hi {dadName}, I\'m Dad'
        await message.channel.send(response)

    if 'tell me a joke' in message.content.lower():
        randJoke = random.choice(dadJokes)
        print(randJoke)
        response = randJoke[0][0] + "?"
        await message.channel.send(response)
        time.sleep(2)
        response = randJoke[1][0]
        await message.channel.send(response)

client.run(TOKEN)