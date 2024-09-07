'use server';
import Image from "next/image";

export default async function Home() {
//     await fetch(process.env.SGR_BACKEND_API);
  const backendApi = process.env.SGR_BACKEND_API;

  return (
    <div>
        Hello hello
        <br/>
        {backendApi}
    </div>
  );
}
